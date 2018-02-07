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
                        <Input v-model="blog.blogTitle"></Input>
                    </FormItem>
                    <FormItem label="博客概要">
                        <Input v-model="blog.blogIntroduction" type="textarea" :autosize="{minRows: 2,maxRows: 5}" placeholder="Enter something..."></Input>
                    </FormItem>
                </Form>
                <textarea id="iview_admin_markdown_editor" style="display:none;"></textarea>
            </Card>
            </Col>
            <Col :md="24" :lg="8">
            <Card :bordered="false">
                <p slot="title">
                    <Icon type="paper-airplane"></Icon>
                    发布</p>
                <Form ref="formCustom" :model="blog" :label-width="80">
                    <FormItem label="博客状态" prop="blogstatus">
                        <Select v-model="blog.blogStatus">
                            <Option value="01">save</Option>
                            <Option value="02">publish</Option>
                        </Select>
                    </FormItem>
                    <FormItem label="博客类型" prop="blogtype">
                        <Select v-model="blog.blogType">
                            <Option value="01">技术</Option>
                            <Option value="02">生活</Option>
                            <Option value="03">小说</Option>
                        </Select>
                    </FormItem>
                    <FormItem>
                        <Button type="ghost" @click="saveblog" style="margin-left: 8px">预览</Button>
                        <Button type="primary" @click="saveblog">保存</Button>
                    </FormItem>
                </Form>
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
                            <Option v-for="item in articleTagList" :value="item.flagNumber" :key="item.flagId">{{ item.flagName }}</Option>
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
    import axios from 'axios';
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
                modal1: false,
                simplemde: '',
                blog: {
                    blogtitle: '',
                    blogTitle: '',
                    blogAuthor: '',
                    blogPublishtime: '',
                    blogBannerurl: '',
                    blogIntroduction: '',
                    blogStatus: '01',
                    blogType: '01',
                    blogSubtitle: '',
                    blogNumber: '',
                    blogContent: '',
                    tags: [],
                    pageNo: '',
                    pageSize: ''
                }
            };
        },
        mounted() {
            let me = this;
            let simplemde = new SimpleMDE({
                autofocus: true,
                forceSync: true,
                autosave: {
                    enabled: true,
                    uniqueId: "MyUniqueID",
                    delay: 1000,
                },
                placeholder: "Type here...",
                element: document.getElementById('iview_admin_markdown_editor'),
                toolbar: ['bold', 'italic', 'strikethrough', 'heading', 'heading-smaller', 'heading-bigger', 'heading-1', 'heading-2', 'heading-3', '|', 'code', 'quote', 'unordered-list', 'clean-block', '|', 'link', 'image', 'table', 'horizontal-rule', '|', 'preview', 'guide']
            });
            simplemde.codemirror.on("change", function(){
                console.log(simplemde.value());
                me.blog.blogContent = simplemde.value();
                console.log(me.blog.blogContent);
            });

            // 页面加载完成后加载标签列表
            this.getFlagList();
        },
        methods: {
            handleSelectTag () {
                localStorage.tagsList = JSON.stringify(this.articleTagSelected); // 本地存储文章标签列表
            },
            cancelCreateNewTag () {
                this.newTagName = '';
                this.addingNewTag = false;
            },
            handleAddNewTag () {
                this.addingNewTag = !this.addingNewTag;
            },
            createNewTag () {
                var me = this;
                if (this.newTagName.length !== 0) {
                    //this.articleTagList.push({flagName: this.newTagName});
                    this.addingNewTag = false;
                    // setTimeout(() => {
                    //     this.newTagName = '';
                    // }, 200);
                    console.log("看看标签名称是什么"+this.newTagName);
                    let flag = {
                        flagId: null,
                        flagNumber: null,
                        flagName: this.newTagName,
                        flagIcon: null
                    };
                    axios.post('/daisy/saveFlag', flag)
                        .then(function (data) {
                            data = data.data;
                            if(data.success) {
                                console.dir(data);
                                me.getFlagList();
                            }
                        })
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
                this.saveblog();
            },
            handleSuccess (res) {
                console.dir(res);

            },
            ok () {

            },
            cancel () {

            },
            saveblog () {
                var me = this;
                this.blog.tags = this.articleTagSelected;
                axios.post('/daisy/saveBlog', this.blog)
                    .then(function (data) {
                        console.dir(data);
                    })
            },
            getFlagList () {
                var me = this;
                axios.get('/daisy/selectFlagList')
                    .then(function (data) {
                        data = data.data;
                        if(data.success) {
                            console.dir(data);
                            me.articleTagList = data.data;
                        }
                    })
            }
        }
    }
</script>