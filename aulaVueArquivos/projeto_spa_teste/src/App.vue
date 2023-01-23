<template>
  <HeaderContent />
  <NavBar />
  <SobreNos />
  <MainContent />
  <FooterContent />
</template>

<script>
  import HeaderContent from './components/HeaderContent'
  import NavBar from './components/NavBar'
  import SobreNos from './components/SobreNos'
  import MainContent from './components/MainContent'
  import FooterContent from './components/FooterContent'

  export default {
    name: 'App',
    components: {
      NavBar,
      HeaderContent,
      MainContent,
      FooterContent,
      SobreNos
    },
    data() {
      return {
        
      }
    }
  }
</script>

<style>
  a {
    color:red;
  }
</style>