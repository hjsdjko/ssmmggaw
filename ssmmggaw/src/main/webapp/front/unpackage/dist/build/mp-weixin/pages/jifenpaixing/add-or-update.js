(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/jifenpaixing/add-or-update"],{3366:function(e,n,t){"use strict";var r=t("8308"),a=t.n(r);a.a},"48f1":function(e,n,t){"use strict";(function(e){t("e5b1");r(t("66fd"));var n=r(t("8bcf"));function r(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,t("543d")["createPage"])},8308:function(e,n,t){},"8bcf":function(e,n,t){"use strict";t.r(n);var r=t("8cf5"),a=t("d621");for(var i in a)"default"!==i&&function(e){t.d(n,e,(function(){return a[e]}))}(i);t("3366");var u,o=t("f0c5"),c=Object(o["a"])(a["default"],r["b"],r["c"],!1,null,"766061b7",null,!1,r["a"],u);n["default"]=c.exports},"8cf5":function(e,n,t){"use strict";var r;t.d(n,"b",(function(){return a})),t.d(n,"c",(function(){return i})),t.d(n,"a",(function(){return r}));var a=function(){var e=this,n=e.$createElement;e._self._c},i=[]},d4c2:function(e,n,t){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var r=a(t("a34a"));function a(e){return e&&e.__esModule?e:{default:e}}function i(e,n,t,r,a,i,u){try{var o=e[i](u),c=o.value}catch(f){return void t(f)}o.done?n(c):Promise.resolve(c).then(r,a)}function u(e){return function(){var n=this,t=arguments;return new Promise((function(r,a){var u=e.apply(n,t);function o(e){i(u,r,a,o,c,"next",e)}function c(e){i(u,r,a,o,c,"throw",e)}o(void 0)}))}}var o=function(){Promise.all([t.e("common/vendor"),t.e("components/w-picker/w-picker")]).then(function(){return resolve(t("eaaa"))}.bind(null,t)).catch(t.oe)},c={data:function(){return{ruleForm:{yuefen:"",paixingbiao:"",paixingtu:""},yuefenOptions:[],yuefenIndex:0,user:{},ro:{yuefen:!1,paixingbiao:!1,paixingtu:!1}}},components:{wPicker:o},computed:{},onLoad:function(n){var t=this;return u(r.default.mark((function a(){var i,u,o,c;return r.default.wrap((function(a){while(1)switch(a.prev=a.next){case 0:return i=e.getStorageSync("nowTable"),a.next=3,t.$api.session(i);case 3:if(u=a.sent,t.user=u.data,t.yuefenOptions="一月,二月,三月,四月,五月,六月,七月,八月,九月,十月,十一月,十二月".split(","),t.ruleForm.userid=e.getStorageSync("userid"),n.refid&&(t.ruleForm.refid=n.refid,t.ruleForm.nickname=e.getStorageSync("nickname")),!n.id){a.next=14;break}return t.ruleForm.id=n.id,a.next=12,t.$api.info("jifenpaixing",t.ruleForm.id);case 12:u=a.sent,t.ruleForm=u.data;case 14:if(!n.cross){a.next=33;break}o=e.getStorageSync("crossObj"),a.t0=r.default.keys(o);case 17:if((a.t1=a.t0()).done){a.next=33;break}if(c=a.t1.value,"yuefen"!=c){a.next=23;break}return t.ruleForm.yuefen=o[c],t.ro.yuefen=!0,a.abrupt("continue",17);case 23:if("paixingbiao"!=c){a.next=27;break}return t.ruleForm.paixingbiao=o[c],t.ro.paixingbiao=!0,a.abrupt("continue",17);case 27:if("paixingtu"!=c){a.next=31;break}return t.ruleForm.paixingtu=o[c],t.ro.paixingtu=!0,a.abrupt("continue",17);case 31:a.next=17;break;case 33:t.styleChange();case 34:case"end":return a.stop()}}),a)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},yuefenChange:function(e){this.yuefenIndex=e.target.value,this.ruleForm.yuefen=this.yuefenOptions[this.yuefenIndex]},paixingtuTap:function(){var e=this;this.$api.upload((function(n){e.ruleForm.paixingtu=e.$base.url+"upload/"+n.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=this;return u(r.default.mark((function n(){return r.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:if(!e.ruleForm.id){n.next=5;break}return n.next=3,e.$api.update("jifenpaixing",e.ruleForm);case 3:n.next=7;break;case 5:return n.next=7,e.$api.add("jifenpaixing",e.ruleForm);case 7:e.$utils.msgBack("提交成功");case 8:case"end":return n.stop()}}),n)})))()},optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var n=new Date,t=n.getFullYear(),r=n.getMonth()+1,a=n.getDate();return"start"===e?t-=60:"end"===e&&(t+=2),r=r>9?r:"0"+r,a=a>9?a:"0"+a,"".concat(t,"-").concat(r,"-").concat(a)},toggleTab:function(e){this.$refs[e].show()}}};n.default=c}).call(this,t("543d")["default"])},d621:function(e,n,t){"use strict";t.r(n);var r=t("d4c2"),a=t.n(r);for(var i in r)"default"!==i&&function(e){t.d(n,e,(function(){return r[e]}))}(i);n["default"]=a.a}},[["48f1","common/runtime","common/vendor"]]]);