<template>
    <div class="box">
        <h3>Saboreie nossas delícias!</h3>
        <span>Estamos aberto 24hs</span>
        <div class="box box__produto">
            <div v-for="item in loja" :key="item">
                {{ item.nome }} - R$ {{ item.preco }}
            </div>
        </div>
    </div>
</template>

<script>
export default {
    props:{
        tipo:String
    },
    data(){
        return{
            // tipo:'sobremesas'
    }
    },
    computed: {
        produtos() {
            return this.$store.state.produtos
        },
        loja(){
          return this.$store.getters.loja(this.tipo)
        }
    },
    methods:{
        aplicaDesconto(){
            this.$store.dispatch('aplicaDesconto',this.tipo)
        }
    },
    mounted(){
        this.aplicaDesconto()
    }
}
</script>

<style scoped>
h3 {
    text-align: left;
    padding: 0 1rem;
}
.box {
    text-align: left;
    padding: 1rem;
    margin: 1.3rem;
    box-shadow: 2px 2px 40px rgb(225, 229, 229);
    width: 50%;
    border-radius: 0 0 0.8rem 0.8rem;
    background-color: rgba(145, 208, 223, 0.656);
}
.box div {
    margin: 0.4rem 0;
}
.box__produto div::before {
    content: '+ ';
}
</style>
