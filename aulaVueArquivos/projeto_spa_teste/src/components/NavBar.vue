<template>
    <div><a href="#">Home</a> | Sobre | Nossos Pratos</div>
    <ul class="bg-light p-3 list-inline">
      <li class="list-inline-item" v-for="(item, n) in menu" :key="n"><a href="#">{{ item }}</a></li>
    </ul>
</template>

<script>
export default {
    name: 'NavBar',
    data() {
      return {
        menu:['Home','Sobre','Nossos Pratos','Contato']
      }
    }
}
</script>

<style scoped>
  a {
    color: orange;
  }
</style>
