<template>
  <HeaderContent />
  <NavBar />
  <SobreNos />
  <MainContent />
  <FooterContent />

  <div class="boxSetoresMain">
    <SetoresContato>
    <h3>Reservas</h3>
    <template #emailSetor="{email}">
      Email: {{ email.email_reservas }}
    </template>
  </SetoresContato>

  <SetoresContato>
    <h3>Financeiro</h3>
    <template #emailSetor="{email}">
      Email: {{ email.email_financeiro }}
    </template>
  </SetoresContato>
    
  <SetoresContato>
    <h3>Outras Informações</h3>
    <template #emailSetor></template>
  </SetoresContato>
  </div>
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

  .boxSetoresMain {
    display: flex;
  }
</style>