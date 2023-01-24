<template>
    <h3>Lista de Sobremesas</h3>
    <ul>
        <li v-for="(sobremesa) in sobremesas" 
            :key="sobremesa" :ref="arr.elementos">{{ sobremesa }}</li>
    </ul>
</template>

<script>
//:ref="(el)=>{elementos[i] = el}">{{ sobremesa }}
import { onMounted, ref } from 'vue'
export default {
    name: 'TemplateRefsVfor',
    setup() {
       const sobremesas = ref(['Bomba de Chocolate','Quindim','Mousse','Sorvete de Pistache'])
       const elementos = ref([])
       const arr = {elementos}
       
       onMounted( ()=> {
        console.log(elementos.value.map( n => n.textContent))
       })
       return {
        sobremesas,
        elementos,
        arr
       }
    },
}
</script>
<style scoped>
    h3, li {
        text-align: left;
    }
</style>