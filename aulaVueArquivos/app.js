// const {createApp} = Vue 
import {createApp} from 'https://unpkg.com/vue@3/dist/vue.esm-browser.js'
createApp({ 
    data(){ 
        return{ 
            msg: 'Bem vindo ao Vue Js!' 
            } 
        } 
    })//.mount('#app') 

    import calculos from './calculos.js'
    createApp(calculos).mount('#app')