<template>
    <NavBar />
    <p class="p-3"><a href="#">Aproveite nossas promoções</a></p>
    <!-- <img :src="require('@/assets/produtos/noodles-7390775_1920.jpg')" class="w-25" /> -->
    <div class="border p-3 mb-5">
        <img :src="urlImage" :alt="altImage" class="w-25" />
        <h4 class="py-3">{{ altImage }}</h4>
        <ButtonImage @trocarImagem="novaImagem" />
    </div>
    
</template>

<script>
import NavBar from './NavBar'
import ButtonImage from './ButtonImage'
export default {
    name: 'MenuImage',
    data() {
        return {
            urlImage: require('@/assets/produtos/noodles-7390775_1920.jpg'),
            altImage: 'Penne ao Sugo'
        }
    },
    components: {
        NavBar,
        ButtonImage
    },
    methods: {
        novaImagem() {
            this.urlImage = require('@/assets/produtos/taco-4709325_1920.jpg')
            this.altImage = 'Tacos mexicanos'
        }
    }
}
</script>

<style>
  a {
    color:green;
  }
</style>