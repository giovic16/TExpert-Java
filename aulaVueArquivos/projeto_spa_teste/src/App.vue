<template>
  <HeaderContent />
  <NavBar />
  <MainContent />
  <FooterContent />
</template>

<script>
  import HeaderContent from './components/HeaderContent'
  import NavBar from './components/NavBar'
  import MainContent from './components/MainContent'
  import FooterContent from './components/FooterContent'

  export default {
    name: 'App',
    components: {
      NavBar,
      HeaderContent,
      MainContent,
      FooterContent
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