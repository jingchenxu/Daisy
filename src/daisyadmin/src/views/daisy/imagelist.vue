<style scoped lang="less">
    @import './imagelist.less';
</style>

<template>
    <div>
        <Card :bordered="false">
            <div style="text-align:left">
                <Form :label-width="80" ref="formInline" :model="searchParams" inline>
                    <FormItem label="图片编号" prop="blogTitle">
                        <Input type="text" v-model="searchParams.imageNumber" placeholder="请输入图片编号">
                        </Input>
                    </FormItem>
                    <!--<FormItem label="博客状态">-->
                        <!--<Select v-model="searchParams.blogStatus">-->
                            <!--<Option value="null">&#45;&#45;请选择&#45;&#45;</Option>-->
                            <!--<Option value="01">save</Option>-->
                            <!--<Option value="02">publish</Option>-->
                        <!--</Select>-->
                    <!--</FormItem>-->
                    <!--<FormItem label="博客类型">-->
                        <!--<Select v-model="searchParams.blogType">-->
                            <!--<Option value="null">&#45;&#45;请选择&#45;&#45;</Option>-->
                            <!--<Option value="01">技术</Option>-->
                            <!--<Option value="02">生活</Option>-->
                            <!--<Option value="02">小说</Option>-->
                        <!--</Select>-->
                    <!--</FormItem>-->
                    <FormItem>
                        <Button type="primary" @click="handleSubmit"><Icon type="ios-search-strong"></Icon> 查询</Button>
                    </FormItem>
                </Form>
            </div>
        </Card>
        <Card :bordered="false" style="margin-top: 10px;">
            <p slot="title">图片列表</p>
            <Table :loading="loading" size="small" highlight-row ref="currentRowTable" :columns="columns3" :data="data1"></Table>
            <Page @on-change="pageChange" @on-page-size-change="sizeChange" :styles="{marginTop: '10px'}" :total="total" :page-size="searchParams.pageSize" size="small" show-elevator show-sizer></Page>
        </Card>
        <Modal
                v-model="modal1"
                title="图片详情"
                @on-ok="ok"
                @on-cancel="cancel">
            <Form :model="currentRow" :label-width="120">
                <FormItem label="图片">
                    <div class="demo-upload-list" v-for="item in uploadList">
                        <template v-if="item.status === 'finished'">
                            <img :src="item.url">
                            <div class="demo-upload-list-cover">
                                <Icon type="ios-eye-outline" @click.native="handleView(item.name)"></Icon>
                                <Icon type="ios-trash-outline" @click.native="handleRemove(item)"></Icon>
                            </div>
                        </template>
                        <template v-else>
                            <Progress v-if="item.showProgress" :percent="item.percentage" hide-info></Progress>
                        </template>
                    </div>
                    <Upload
                            ref="upload"
                            :show-upload-list="false"
                            :default-file-list="defaultList"
                            :on-success="handleSuccess"
                            :format="['jpg','jpeg','png']"
                            :max-size="2048"
                            :on-format-error="handleFormatError"
                            :on-exceeded-size="handleMaxSize"
                            :before-upload="handleBeforeUpload"
                            multiple
                            type="drag"
                            action="/daisy/fileUpload"
                            style="display: inline-block;width:58px;">
                        <div style="width: 58px;height:58px;line-height: 58px;">
                            <Icon type="camera" size="20"></Icon>
                        </div>
                    </Upload>
                    <Modal title="View Image" v-model="visible">
                        <img :src="'https://o5wwk8baw.qnssl.com/' + imgName + '/large'" v-if="visible" style="width: 100%">
                    </Modal>
                </FormItem>
                <FormItem label="图片名称">
                    <Input v-model="currentRow.imageName" placeholder="Enter something..."></Input>
                </FormItem>
                <FormItem label="是否在首页显示">
                    <i-switch v-model="currentRow.imageIsIndex" size="large">
                        <span slot="open">On</span>
                        <span slot="close">Off</span>
                    </i-switch>
                </FormItem>
                <FormItem label="是否可系统外访问">
                    <i-switch v-model="currentRow.imageIsRemote" size="large">
                        <span slot="open">On</span>
                        <span slot="close">Off</span>
                    </i-switch>
                </FormItem>
                <FormItem label="图片描述">
                    <Input v-model="currentRow.imageDescription" type="textarea" :autosize="{minRows: 0,maxRows: 1}" placeholder="Enter something..."></Input>
                </FormItem>
                <FormItem>
                    <Button @click="submit" type="primary">提交</Button>
                    <Button type="ghost" style="margin-left: 8px">取消</Button>
                </FormItem>
            </Form>
        </Modal>
    </div>
</template>

<script>
    import axios from 'axios';
    export default {
        name: 'imagelist',
        data () {
            return {
                total: 40, // 图片总数量
                loading: true,
                modal1: false,
                searchParams: {
                    imageId: null,
                    imageNumber: null,
                    imageName: null,
                    imageUrl: null,
                    imageIsIndex: null,
                    imageDescription: null,
                    imageIsRemote: null,
                    imageCreatetime: null,
                    imageCreator: null,
                    imageType: null,
                    pageNo: 1,
                    pageSize: 10
                },
                currentRow: {
                    imageId: '',
                    imageNumber: '',
                    imageName: '',
                    imageUrl: '',
                    imageIsIndex: false,
                    imageDescription: '',
                    imageIsRemote: false,
                    imageCreatetime: '',
                    imageCreator: '',
                    imageType: '',
                    pageNo: 1,
                    pageSize: 10
                },
                columns3: [
                    {
                        type: 'index',
                        width: 60,
                        align: 'center'
                    },
                    {
                        title: '图片编号',
                        key: 'imageNumber'
                    },
                    {
                        title: '图片名称',
                        key: 'imageName'
                    },
                    {
                        title: '图片创建时间',
                        key: 'imageCreatetime'
                    },
                    {
                        title: '图片创建人',
                        key: 'imageCreator'
                    },
                    {
                        title: '操作',
                        key: 'action',
                        width: 150,
                        align: 'center',
                        render: (h, params) => {
                            return h('div', [
                                h('Button', {
                                    props: {
                                        type: 'primary',
                                        size: 'small'
                                    },
                                    style: {
                                        marginRight: '5px'
                                    },
                                    on: {
                                        click: () => {
                                            this.show(params)
                                        }
                                    }
                                }, '查看'),
                                h('Button', {
                                    props: {
                                        type: 'error',
                                        size: 'small'
                                    },
                                    on: {
                                        click: () => {
                                            this.remove(params)
                                        }
                                    }
                                }, '删除')
                            ]);
                        }
                    }
                ],
                data1: [],
                defaultList: [],
                imgName: '',
                visible: false,
                uploadList: []
            }
        },
        mounted () {
            this.getImageList();
            this.uploadList = this.$refs.upload.fileList;
        },
        methods: {
            handleSubmit(name) {
                me.getBlogList();
            },
            getImageList () {
                let me = this;
                me.loading = true;
                axios.get('/daisy/getImageListByPage',{
                    params: me.searchParams})
                    .then(function (data) {
                        data = data.data;
                        if(data.success) {
                            console.dir(data.data.list);
                            me.data1 = data.data.list;
                            // 设置博客总数
                            me.total = data.data.total;
                        }
                        me.loading = false;
                    })
            },
            pageChange(pageNo) {
                var me = this;
                me.searchParams.pageNo = pageNo;
                me.getImageList();
            },
            sizeChange(pageSize) {
                var me = this;
                me.searchParams.pageSize = pageSize;
                me.searchParams.pageNo = 1;
                me.getImageList();
            },
            show (value) {
                this.currentRow = value.row;
                // this.uploadList = [{
                //     name: value.row.imageName,
                //     url: value.row.imageUrl
                // }];
                this.modal1 = true;
            },
            remove (value) {
                let me = this;
                let imageId = value.row.imageId;
                axios.get('/daisy/deleteImage',{
                    params: {
                        imageId
                    }})
                    .then(function (data) {
                        data = data.data;
                        if(data.success) {
                            console.dir(data);
                            me.getImageList();
                        }
                    })
            },
            ok () {

            },
            cancel () {

            },
            handleView (name) {
                this.imgName = name;
                this.visible = true;
            },
            handleRemove (file) {
                const fileList = this.$refs.upload.fileList;
                this.$refs.upload.fileList.splice(fileList.indexOf(file), 1);
            },
            handleSuccess (res, file) {
                let me = this;
                if(res.success){
                    file.url = res.data.imgUrl;
                    file.name = res.data.imgName;
                    me.currentRow.imageUrl = res.data.imgUrl;
                }
            },
            handleFormatError (file) {
                this.$Notice.warning({
                    title: 'The file format is incorrect',
                    desc: 'File format of ' + file.name + ' is incorrect, please select jpg or png.'
                });
            },
            handleMaxSize (file) {
                this.$Notice.warning({
                    title: 'Exceeding file size limit',
                    desc: 'File  ' + file.name + ' is too large, no more than 2M.'
                });
            },
            handleBeforeUpload () {
                const check = this.uploadList.length < 5;
                if (!check) {
                    this.$Notice.warning({
                        title: 'Up to five pictures can be uploaded.'
                    });
                }
                return check;
            },
            submit () {
                axios.post('/daisy/updateImage', this.currentRow)
                    .then(function (data) {
                        console.dir(data);
                    })
            }
        }
    }
</script>