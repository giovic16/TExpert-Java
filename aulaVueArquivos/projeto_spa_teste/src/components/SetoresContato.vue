<template>
    <div class="boxSetores p-4 mx-3 mb-4">
        <slot>
            <h3>Reservas</h3>
        </slot>
        <slot name="emailSetor" :email="{email_reservas, email_financeiro}">
            <p>Email: restaurante@email.com.br</p>
        </slot>
    </div>
</template>

<script>
export default {
    name: 'SetoresContato',
    data() {
        return {
            email_reservas: 'reservas@email.com.br',
            email_financeiro: 'financeiro@email.com.br'
        }
    },
}
</script>

<style scoped>
    .boxSetores {
        box-shadow: 8px 8px 8px #999;
        border: 1px solid #ccc;
        border-radius: 12px; 
        width: 32%;   
    }
</style>