webpackJsonp([26],{241:function(t,n,e){"use strict";function r(t){f||e(346)}Object.defineProperty(n,"__esModule",{value:!0});var o=e(315),a=e.n(o);for(var i in o)"default"!==i&&function(t){e.d(n,t,function(){return o[t]})}(i);var s=e(348),d=e.n(s),f=!1,c=e(1),l=r,g=c(a.a,d.a,!1,l,null,null);g.options.__file="src\\views\\error-page\\404.vue",n.default=g.exports},315:function(t,n,e){"use strict";Object.defineProperty(n,"__esModule",{value:!0}),n.default={name:"Error404",methods:{backPage:function(){this.$router.go(-1)},goHome:function(){this.$router.push({name:"home_index"})}}}},346:function(t,n,e){var r=e(347);"string"==typeof r&&(r=[[t.i,r,""]]),r.locals&&(t.exports=r.locals);e(17)("1615c22d",r,!1,{})},347:function(t,n,e){n=t.exports=e(16)(!1),n.push([t.i,"\n@-webkit-keyframes error404animation {\n0% {\n    -webkit-transform: rotateZ(0deg);\n            transform: rotateZ(0deg);\n}\n20% {\n    -webkit-transform: rotateZ(-60deg);\n            transform: rotateZ(-60deg);\n}\n40% {\n    -webkit-transform: rotateZ(-10deg);\n            transform: rotateZ(-10deg);\n}\n60% {\n    -webkit-transform: rotateZ(50deg);\n            transform: rotateZ(50deg);\n}\n80% {\n    -webkit-transform: rotateZ(-20deg);\n            transform: rotateZ(-20deg);\n}\n100% {\n    -webkit-transform: rotateZ(0deg);\n            transform: rotateZ(0deg);\n}\n}\n@keyframes error404animation {\n0% {\n    -webkit-transform: rotateZ(0deg);\n            transform: rotateZ(0deg);\n}\n20% {\n    -webkit-transform: rotateZ(-60deg);\n            transform: rotateZ(-60deg);\n}\n40% {\n    -webkit-transform: rotateZ(-10deg);\n            transform: rotateZ(-10deg);\n}\n60% {\n    -webkit-transform: rotateZ(50deg);\n            transform: rotateZ(50deg);\n}\n80% {\n    -webkit-transform: rotateZ(-20deg);\n            transform: rotateZ(-20deg);\n}\n100% {\n    -webkit-transform: rotateZ(0deg);\n            transform: rotateZ(0deg);\n}\n}\n.error404-body-con {\n  width: 700px;\n  height: 500px;\n  position: absolute;\n  left: 50%;\n  top: 50%;\n  -webkit-transform: translate(-50%, -50%);\n          transform: translate(-50%, -50%);\n}\n.error404-body-con-title {\n  text-align: center;\n  font-size: 240px;\n  font-weight: 700;\n  color: #2d8cf0;\n  height: 260px;\n  line-height: 260px;\n  margin-top: 40px;\n}\n.error404-body-con-title span {\n  display: inline-block;\n  color: #19be6b;\n  font-size: 230px;\n  -webkit-animation: error404animation 3s ease 0s infinite alternate;\n          animation: error404animation 3s ease 0s infinite alternate;\n}\n.error404-body-con-message {\n  display: block;\n  text-align: center;\n  font-size: 30px;\n  font-weight: 500;\n  letter-spacing: 12px;\n  color: #dddde2;\n}\n.error404-btn-con {\n  text-align: center;\n  padding: 20px 0;\n  margin-bottom: 40px;\n}\n",""])},348:function(t,n,e){"use strict";Object.defineProperty(n,"__esModule",{value:!0});var r=function(){var t=this,n=t.$createElement,e=t._self._c||n;return e("div",{staticClass:"error404"},[e("div",{staticClass:"error404-body-con"},[e("Card",[e("div",{staticClass:"error404-body-con-title"},[t._v("4"),e("span",[e("Icon",{attrs:{type:"ios-navigate-outline"}})],1),t._v("4")]),t._v(" "),e("p",{staticClass:"error404-body-con-message"},[t._v("YOU  LOOK  LOST")]),t._v(" "),e("div",{staticClass:"error404-btn-con"},[e("Button",{staticStyle:{width:"200px"},attrs:{size:"large",type:"text"},on:{click:t.goHome}},[t._v("返回首页")]),t._v(" "),e("Button",{staticStyle:{width:"200px","margin-left":"40px"},attrs:{size:"large",type:"primary"},on:{click:t.backPage}},[t._v("返回上一页")])],1)])],1)])},o=[];r._withStripped=!0;var a={render:r,staticRenderFns:o};n.default=a}});