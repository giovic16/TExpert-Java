<template>
    <div class="boxSetores p-4 mx-3 mb-4 w-50">
        <slot>
            <h3>Reservas</h3>
        </slot>
        <p>Email: restaurante@email.com.br</p>
    </div>
</template>

<script>
export default {
    name: 'SetoresContato',
    data() {
        return {

        }
    },
}
</script>

<style scoped>
    .boxSetores {
        box-shadow: 8px 8px 8px #999;
        border: 1px solid #ccc;
        border-radius: 12px;    
    }
</style>