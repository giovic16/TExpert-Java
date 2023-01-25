<template>
    <p>Pedidos Anteriores:</p>
    <h4>Encontradas {{ msgPedidos }} ocorrências</h4>
    <ul>
        <li v-for="pedido in user.pedidos" :key="pedido">{{ pedido }}</li>
    </ul>
</template>

<script>
export default {
    nome: 'OptionAPI',
    data() {
        return {
            user: {
                nome: 'Tom Mazzeo',
                pedidos: [
                    'Lazanha 4 queijos',
                    'Feijoada',
                    'Sopa de Legumes',
                    'Macarronada'
                ]
            }
        }
    },
    computed: {
        //getter
        msgPedidos(){
            return this.user.pedidos.length > 0 ? this.user.pedidos.length : '0' 
        }
    }
}
</script>