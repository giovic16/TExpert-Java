<template>
    <nav>
        <router-link to="/pratos-quentes">Pratos Quentes</router-link> |
        <router-link to="/sobremesas">Sobremesas</router-link> |
      
    </nav>
    <router-view />
     <div>
      <button @click="jokeData">Get Jokes</button>
      <button @click="cryptoData">Get Crypto Data</button>
    </div>
    <div class="display">
        <img :src="icon_norris" />
      <pre>{{ JokeNorris.data }}</pre>
      <!-- <pre>{{ CriptoCoin.data.data[0].baseId }}</pre> -->
    </div>
    <div v-for="item in CriptoCoin.data.data" :key="item">
                {{ item.baseId }} - R$ {{  }}
            </div>
</template>


<style>
#app {
    font-family: Avenir, Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
}

nav {
    padding: 30px;
}

nav a {
    font-weight: bold;
    color: #2c3e50;
}

nav a.router-link-exact-active {
    color: #42b983;
}
</style>


<script>
import { mapState } from "vuex";
export default {
  name: "App",
  data(){
    return{
        icon_norris:'https://api.chucknorris.io/img/chucknorris_logo_coloured_small@2x.png'
    }
  },
  computed: {
    ...mapState(["JokeNorris", "CriptoCoin"]),
  },
  methods: {
    jokeData() {
      this.$store.dispatch("JokeNorris/getData");
    },
    cryptoData() {
      this.$store.dispatch("CriptoCoin/getData");
    },
  },
};
</script>