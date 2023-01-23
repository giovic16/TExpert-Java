<template>
  <header>HEADER</header>
  <hr />
  <NavBar />
  <p class="mt-3">A aula de hoje é {{ info }}</p>
  <hr />
  <button @click="showHideEmail" class="btn btn-info my-2" >Clique para contato</button>
  <p v-show="showEmail" class="mt-2">restaurante1312@email.com</p>
  <footer>
    FOOTER
    <MenuImage />
  </footer>
</template>

<script>
  import NavBar from './components/NavBar'
  import MenuImage from './components/MenuImage'
  export default {
    name: 'App',
    components: {
      NavBar,
      MenuImage
    },
    data() {
      return {
        info: 'Iniciando com CLI Vue',
        showEmail: false
      }
    },
    methods: {
      showHideEmail() {
        this.showEmail = !this.showEmail
        console.log(this.showEmail)
      }
    }
  }
</script>