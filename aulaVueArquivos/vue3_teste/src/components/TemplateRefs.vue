<template>
  <div>
    <h1>{{msg}}</h1>
    <p>Digite seu novo email!</p>
    <input type="text" ref="inputText">
    <button @click="alertaEmail()">Confirmar</button>
    <p><b>Email atual: </b> {{ email }}</p>
  </div>
</template>

<script>
export default {
  data(){
    return{
      email:'administrador@email.com.br',
      alerta:''
    }
  },
  name:'TemplateRefs',
  props:{
    msg:String
  },
  mounted(){
    this.$refs.inputText.focus()
  },
  watch:{
    email(novoValor,valorAtual){
        console.log('Email Atual',valorAtual)
        console.log('Novo Email',novoValor)
    }
  },
  methods:{
    alertaEmail(){
      this.email = this.$refs.inputText.value
      this.alerta = `Email atualizado com sucesso. Seu novo email é ${this.email}`
      alert(this.alerta)
    }
  }
}
</script>