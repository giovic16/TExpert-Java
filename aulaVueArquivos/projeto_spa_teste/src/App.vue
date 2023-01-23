<template>
  <MeuComp />
  <p>A aula de hoje é {{ info }}</p>
</template>

<script>
  import MeuComp from './components/MeuComp'
  export default {
    name: 'App',
    components: {
      MeuComp
    },
    data() {
      return {
        info: 'Iniciando com CLI Vue'
      }
    }
  }
</script>