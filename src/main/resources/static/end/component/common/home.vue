<template>
    <div class="">
        <v-head/>
        <v-sidebar/>

    </div>
</template>

<script>
import vHead from './header.vue';
import vSidebar from './sidebar.vue';
export default {
    name: "home",
    components: {
        vHead,
        vSidebar
    }
}
</script>

<style scoped>

</style>