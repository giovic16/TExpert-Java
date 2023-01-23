<template>
    <NavBar />
    <p class="p-3">Aproveite nossas promoções</p>
    <!-- <img :src="require('@/assets/produtos/noodles-7390775_1920.jpg')" class="w-25" /> -->
    <img :src="urlImage" :alt="altImage" class="w-25" />
    
</template>

<script>
import NavBar from './NavBar'
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
    }
}
</script>