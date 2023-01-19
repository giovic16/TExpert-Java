// const {createApp} = Vue 
import {createApp} from 'https://unpkg.com/vue@3/dist/vue.esm-browser.js'
createApp({ 
    data(){ 
        return{ 
            msg: 'Bem vindo ao Vue Js!', 
            msg2: 'Bora codar juntos',
            count: 0 
            } 
        } 
    }).mount('#app') 