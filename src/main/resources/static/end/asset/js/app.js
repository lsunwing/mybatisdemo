
define(function (require) {
    // constant
    var SUCCESS_CODE = '0000';
    var SESSION_TIMEOUT = '0001';
    var PERMISION_DEDY = '0002';
    var NO_POWER = '0004';

    // vue
    require('main/lib/vue');
    require('main/lib/vuex');
    require('main/lib/vue-router');

    // axios:易用、简洁且高效的http库
    require('main/lib/axios.min');
    //element-index:一套为开发者、设计师和产品经理准备的基于 Vue 2.0 的桌面端组件库
    require('main/lib/element-index');

    // 自定义组件
    require('./../../asset/js/layout/')


})