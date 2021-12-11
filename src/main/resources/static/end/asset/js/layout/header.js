
define(function (require) {
    // 与页面管理成一个组件
    var tpl = require('header.html?v=0.0.1');

    // 定义一个可复用的页面组件
    Vue.component('header-view', Vue.extend({
        template: tpl,
        computed: {
            // empNo: function () {
            //     return this.$store.getters.getEmpNo;
            // },
            // empName: function () {
            //     return this.$store.getters.getEmpName;
            // },
            // online: function () {
            //     return this.$store.getters.getOnline;
            // }
        },
        method: {
            // logout: function () {
            //     this.$root.logout();
            // }
        }
    }));
})