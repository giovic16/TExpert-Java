<template>
    <p class="mt-3">{{ info }}</p>
    <hr />
    <ul class="list-inline">
        <li v-for="p in pratos" :key="p.id">
            {{ p.opcao }}
        </li>
    </ul>
    <button @click="showHideEmail" class="btn btn-info my-2" >Clique para contato</button>
    <p v-show="showEmail" class="mt-2">restaurante1312@email.com</p>
    <p v-show="showEmail" class="mt-2"><a href="tel: 11 999990000">(11) 999990000</a></p>
</template>

<script>
export default {
    name: 'MainContent',
    data() {
        return {
            info: 'Conheça nossos pratos',
            showEmail: false,
            pratos: [
                {id:1, opcao: 'Salmão Grelhado'},
                {id:2, opcao: 'Feijoada Light'},
                {id:3, opcao: 'Penne ao Sugo'}
            ]
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

<style scoped>
    li::before {
        content: ' -> ';
    }
</style>