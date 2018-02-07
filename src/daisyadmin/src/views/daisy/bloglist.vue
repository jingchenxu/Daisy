<style scoped lang="less">
    @import './bloglist.less';
</style>
<template>
    <div>
        <Card :bordered="false">
            <div style="text-align:left">
                <Form :label-width="80" ref="formInline" :model="searchParams" :rules="ruleInline" inline>
                    <FormItem label="博客标题" prop="blogTitle">
                        <Input type="text" v-model="searchParams.blogTitle" placeholder="请输入博客标题">
                        </Input>
                    </FormItem>
                    <FormItem label="博客状态">
                        <Select v-model="searchParams.blogStatus">
                            <Option value="null">--请选择--</Option>
                            <Option value="01">save</Option>
                            <Option value="02">publish</Option>
                        </Select>
                    </FormItem>
                    <FormItem label="博客类型">
                        <Select v-model="searchParams.blogType">
                            <Option value="null">--请选择--</Option>
                            <Option value="01">技术</Option>
                            <Option value="02">生活</Option>
                            <Option value="02">小说</Option>
                        </Select>
                    </FormItem>
                    <FormItem>
                        <Button type="primary" @click="handleSubmit('formInline')"><Icon type="ios-search-strong"></Icon> 查询</Button>
                    </FormItem>
                </Form>
            </div>
        </Card>
        <Card :bordered="false" style="margin-top: 10px;">
            <p slot="title">博客列表</p>
            <Table :loading="loading" size="small" highlight-row ref="currentRowTable" :columns="columns3" :data="data1"></Table>
            <Page @on-change="pageChange" @on-page-size-change="sizeChange" :styles="{marginTop: '10px'}" :total="total" :page-size="searchParams.pageSize" size="small" show-elevator show-sizer></Page>
        </Card>
    </div>
</template>

<script>
    import axios from 'axios';
    export default {
        name: 'bloglist',
        data () {
            return {
                name: 'jcxu',
                total: 40, // 博客总数量
                loading: true,
                searchParams: {
                    blogId: null,
                    blogTitle: null,
                    blogAuthor: null,
                    blogPublishtime: null,
                    blogBannerurl: null,
                    blogIntroduction: null,
                    blogStatus: null,
                    blogType: null,
                    blogSubtitle: null,
                    blogNumber: null,
                    blogContent: null,
                    tags: [],
                    pageNo: null,
                    pageSize: 10,
                },      // 查询参数
                columns3: [
                    {
                        type: 'index',
                        width: 60,
                        align: 'center'
                    },
                    {
                        title: '博客编号',
                        key: 'blogNumber'
                    },
                    {
                        title: '博客标题',
                        key: 'blogTitle'
                    },
                    {
                        title: '博客作者',
                        key: 'blogAuthor'
                    },
                    {
                        title: '博客发布时间',
                        key: 'blogPublishtime'
                    },
                    {
                        title: '博客状态',
                        key: 'blogStatus'
                    },
                    {
                        title: '博客类型',
                        key: 'blogType'
                    }
                ],
                data1: [
                ],
                formInline: {
                    user: '',
                    password: ''
                },
                ruleInline: {
                    user: [
                        { required: false, message: 'Please fill in the user name', trigger: 'blur' }
                    ],
                    password: [
                        { required: false, message: 'Please fill in the password.', trigger: 'blur' },
                        { type: 'string', min: 6, message: 'The password length cannot be less than 6 bits', trigger: 'blur' }
                    ]
                }
            };
        },
        mounted () {
            this.searchParams.pageNo = 1;
            this.getBlogList();
        },
        methods: {
            handleSubmit(name) {
                var me = this;
                this.$refs[name].validate((valid) => {
                    if (valid) {
                        me.getBlogList();
                    } else {
                        this.$Message.error('Fail!');
                    }
                })
            },
            getBlogList() {
                let me = this;
                me.loading = true;
                axios.get('/daisy/getBlogList',{
                    params: me.searchParams})
                    .then(function (data) {
                        data = data.data;
                        if(data.success) {
                            me.data1 = data.data.pageInfo.list;
                            // 设置博客总数
                            me.total = data.data.pageInfo.total;
                        }
                        me.loading = false;
                    })
            },
            pageChange(pageNo) {
                var me = this;
                me.searchParams.pageNo = pageNo;
                me.getBlogList();
            },
            sizeChange(pageSize) {
                var me = this;
                me.searchParams.pageSize = pageSize;
                me.searchParams.pageNo = 1;
                me.getBlogList();
            }
        }
    }
</script>