<style lang="less">
    @import './login.less';
</style>

<template>
    <div id="particlesJS" class="login" @keydown.enter="handleSubmit">
        <div class="login-con">
            <img style="display: block;" src="../images/logo.png" alt="">
                <Card style="width:300px" :bordered="false">
                    <p slot="title">
                        <Icon type="log-in"></Icon>
                        欢迎登录
                    </p>
                    <div class="form-con">
                        <Form ref="loginForm" :model="form" :rules="rules">
                            <FormItem prop="userName">
                                <Input v-model="form.userName" placeholder="请输入用户名">
                                <span slot="prepend">
                                    <Icon :size="16" type="person"></Icon>
                                </span>
                                </Input>
                            </FormItem>
                            <FormItem prop="password">
                                <Input type="password" v-model="form.password" placeholder="请输入密码">
                                <span slot="prepend">
                                    <Icon :size="14" type="locked"></Icon>
                                </span>
                                </Input>
                            </FormItem>
                            <FormItem>
                                <Button @click="handleSubmit" type="primary" long>登录</Button>
                            </FormItem>
                        </Form>
                    </div>
                </Card>
        </div>
    </div>
</template>

<script>
import Cookies from 'js-cookie';
import axios from 'axios';
import pJS from '@/libs/particles.js';
export default {
    data () {
        return {
            form: {
                userName: '',
                password: ''
            },
            rules: {
                userName: [
                    { required: true, message: '账号不能为空', trigger: 'blur' }
                ],
                password: [
                    { required: true, message: '密码不能为空', trigger: 'blur' }
                ]
            }
        };
    },
    mounted() {
        //pJS("particlesJS");
        particlesJS.load('particlesJS', '/daisy/particles.json', function() {
            console.log('callback - particles.js config loaded');
        });
    },
    methods: {
        handleSubmit () {
            var me = this;
            this.$refs.loginForm.validate((valid) => {
                if (valid) {
                    // 开始登录
                    let params = new URLSearchParams();
                    params.append('username', this.form.userName);
                    params.append('password', this.form.password);
                    axios.post('/daisy/loginDo', params)
                        .then(function (data) {
                            data = data.data;
                            if(data.success) {
                                console.dir(data);
                                Cookies.set('user', me.form.userName);
                                Cookies.set('password', me.form.password);
                                me.$store.commit('setAvator', data.data.avator);
                                Cookies.set('access', data.data.access);
                                me.$router.push({
                                    name: data.data.url
                                });
                            } else {
                                alert("登录失败");
                            }
                        })
                }
            });
        }
    }
};
</script>

<style>

</style>
