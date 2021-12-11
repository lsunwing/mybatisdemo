<template>
    <div class="header">
        <!-- 折叠按钮 -->
        <div class="" @click="collapse">
            <i v-if="" class="el-icon-s-fold"/>
            <i v-else class="el-icon-s-unfold"/>
        </div>
    </div>
</template>

<script>
    export default {
        name: "header"
    },
    method : {
        // 侧边栏折叠
        collapseChage() {
            this.collapse = !this.collapse;
            bus.$emit('collapse', this.collapse);
        }
    }
</script>

<style scoped>
    .header {
        position: relative;
        box-sizing: border-box;
        width: 100%;
        height: 70px;
        font-size: 22px;
        color: #fff;
    }
</style>