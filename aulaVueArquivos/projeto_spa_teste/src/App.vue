<template>
  <HeaderContent />
  <NavBar />
  <SobreNos />
  <MainContent />
  <FooterContent />

  <SetoresContato>
    <h3>Reservas</h3>
  </SetoresContato>

  <SetoresContato>
    <h3>Financeiro</h3>
  </SetoresContato>
  
</template>

<script>
  import HeaderContent from './components/HeaderContent'
  import NavBar from './components/NavBar'
  import SobreNos from './components/SobreNos'
  import MainContent from './components/MainContent'
  import FooterContent from './components/FooterContent'
  import SetoresContato from './components/SetoresContato'

  export default {
    name: 'App',
    components: {
      NavBar,
      HeaderContent,
      MainContent,
      FooterContent,
      SobreNos,
      SetoresContato
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