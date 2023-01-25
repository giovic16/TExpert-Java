import { createRouter, createWebHashHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/sobremesas',
    name: 'sobremesas',
    component: () => import('../views/SobremesasView.vue')
  }
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
