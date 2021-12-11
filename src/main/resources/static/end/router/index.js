import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'

Vue.use(Router)

// export default new Router({
//   routes: [
//     {
//       path: '/',
//       name: 'HelloWorld',
//       component: HelloWorld
//     }
//   ]
// })

const routers = [
    {
        path: '/',
        name: 'Home',
        component: Home
    },
    {
        path: '/helloworld',
        name: 'helloworld',
        component: HelloWorld
    }
]

const router = new VueRouter({
    mode: 'hash', // 路由模式:hash(默认), history
    base: process.env.BASE_URL, // 跟地址
    routers
})

export default router


