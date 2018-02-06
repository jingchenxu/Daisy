<style lang="less">
    @import './blogadd.less';
</style>
<template>
    <div>
        <Row :gutter="10">
            <Col :md="24" :lg="16">
            <Card :bordered="false">
                <p slot="title">markdown编辑器</p>
                <Form :model="blog" label-position="left" :label-width="100">
                    <FormItem label="博客标题">
                        <Input v-model="blog.blogtitle"></Input>
                    </FormItem>
                    <FormItem label="博客概要">
                        <Input v-model="blog.blogIntroduction" type="textarea" :autosize="{minRows: 2,maxRows: 5}" placeholder="Enter something..."></Input>
                    </FormItem>
                </Form>
                <textarea  id="iview_admin_markdown_editor" style="display:none;"></textarea>
            </Card>
            </Col>
            <Col :md="24" :lg="8">
            <Card :bordered="false">
                <p slot="title">
                    <Icon type="paper-airplane"></Icon>
                    发布</p>
                <p class="margin-top-10">
                    <Icon type="android-time"></Icon>&nbsp;&nbsp;状&nbsp;&nbsp;&nbsp; 态：
                    <Select size="small" style="width:90px" value="草稿">
                        <Option v-for="item in articleStateList" :value="item.value" :key="item.value">{{ item.value }}</Option>
                    </Select>
                </p>
                <Row class="margin-top-20 publish-button-con">
                    <span class="publish-button"><Button @click="handlePreview">预览</Button></span>
                    <span class="publish-button"><Button @click="handleSaveDraft">保存草稿</Button></span>
                    <span class="publish-button"><Button @click="handlePublish" :loading="publishLoading" icon="ios-checkmark" style="width:90px;" type="primary">发布</Button></span>
                </Row>
            </Card>
            <div class="card-container">
                <Card :bordered="false">
                    <p slot="title">
                        <Icon type="ios-pricetags-outline"></Icon>
                        标签
                    </p>
                    <Row>
                        <Col span="18">
                        <Select v-model="articleTagSelected" multiple @on-change="handleSelectTag" placeholder="请选择文章标签">
                            <Option v-for="item in articleTagList" :value="item.value" :key="item.value">{{ item.value }}</Option>
                        </Select>
                        </Col>
                        <Col span="6" class="padding-left-10">
                        <Button v-show="!addingNewTag" @click="handleAddNewTag" long type="ghost">新建</Button>
                        </Col>
                    </Row>
                    <transition name="add-new-tag">
                        <div v-show="addingNewTag" class="add-new-tag-con">
                            <Col span="14">
                            <Input v-model="newTagName" placeholder="请输入标签名" />
                            </Col>
                            <Col span="5" class="padding-left-10">
                            <Button @click="createNewTag" long type="primary">确定</Button>
                            </Col>
                            <Col span="5" class="padding-left-10">
                            <Button @click="cancelCreateNewTag" long type="ghost">取消</Button>
                            </Col>
                        </div>
                    </transition>
                </Card>
            </div>
            <div class="card-container">
                <Card>
                    <p slot="title">
                        <Icon type="android-hand"></Icon>
                        可拖拽上传
                    </p>
                    <div class="height-200px">
                        <Upload
                                multiple
                                type="drag"
                                :on-success="handleSuccess"
                                action="/daisy/fileUpload">
                            <div style="padding: 60px 0;height: 200px;">
                                <Icon type="ios-cloud-upload" size="52" style="color: #3399ff"></Icon>
                                <p>点击或将文件拖拽到这里上传</p>
                            </div>
                        </Upload>
                    </div>
                </Card>
            </div>
            </Col>
        </Row>
        <Modal
                v-model="modal1"
                title="点击复制图片链接"
                @on-ok="ok"
                @on-cancel="cancel">
            <p>Content of dialog</p>
            <p>Content of dialog</p>
            <p>Content of dialog</p>
        </Modal>
    </div>
</template>

<script>
    import SimpleMDE from 'simplemde';
    import './simplemde.min.css';
    export default {
        name: 'blogadd',
        data () {
            return {
                name: 'jingchenxu',
                articleTagSelected: [], // 文章选中的标签
                articleTagList: [], // 所有标签列表
                addingNewTag: false, // 添加新标签
                newTagName: '', // 新建标签名
                articleStateList: [{value: '草稿'}, {value: '等待复审'}],
                publishLoading: false,
                modal1: true,
                blog: {
                    blogtitle: '',
                    blogIntroduction: ''
                }
            };
        },
        mounted() {
            new SimpleMDE({
                autofocus: true,
                autosave: {
                    enabled: true,
                    uniqueId: "MyUniqueID",
                    delay: 1000,
                },
                placeholder: "Type here...",
                element: document.getElementById('iview_admin_markdown_editor'),
                toolbar: ['bold', 'italic', 'strikethrough', 'heading', 'heading-smaller', 'heading-bigger', 'heading-1', 'heading-2', 'heading-3', '|', 'code', 'quote', 'unordered-list', 'clean-block', '|', 'link', 'image', 'table', 'horizontal-rule', '|', 'preview', 'guide']
            });
        },
        methods: {
            handleSelectTag () {
                localStorage.tagsList = JSON.stringify(this.articleTagSelected); // 本地存储文章标签列表
            },
            createNewTag () {
                if (this.newTagName.length !== 0) {
                    this.articleTagList.push({value: this.newTagName});
                    this.addingNewTag = false;
                    setTimeout(() => {
                        this.newTagName = '';
                    }, 200);
                } else {
                    this.$Message.error('请输入标签名');
                }
            },
            cancelCreateNewTag () {
                this.newTagName = '';
                this.addingNewTag = false;
            },
            handleAddNewTag () {
                this.addingNewTag = !this.addingNewTag;
            },
            createNewTag () {
                if (this.newTagName.length !== 0) {
                    this.articleTagList.push({value: this.newTagName});
                    this.addingNewTag = false;
                    setTimeout(() => {
                        this.newTagName = '';
                    }, 200);
                } else {
                    this.$Message.error('请输入标签名');
                }
            },
            cancelCreateNewTag () {
                this.newTagName = '';
                this.addingNewTag = false;
            },
            handlePreview () {
                console.log('预览按钮被点击');
            },
            handleSaveDraft () {
                console.log('草稿按钮被点击');
            },
            handlePublish () {
                console.log('发布按钮被点击');
            },
            handleSuccess (res) {
                console.dir(res);

            },
            ok () {

            },
            cancel () {

            }
        }
    }
</script>