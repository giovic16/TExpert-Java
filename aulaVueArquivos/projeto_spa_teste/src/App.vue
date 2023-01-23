<template>
  <header>HEADER</header>
  <hr />
  <NavBar />

  <!-- <MeuComp v-if="show"/> -->
  <p class="mt-3">A aula de hoje é {{ info }}</p>
  <hr />
  <footer>FOOTER
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
        show: true
      }
    }
  }
</script>