<template>
    <!-- <ItemSobremesa :itemProduto="produtos" /> -->
    <ItemSobremesa />
</template>

<script>
import ItemSobremesa from '@/components/ItemSobremesa.vue';
export default {
    name: 'SobremesasView',
    components: {
        ItemSobremesa
    },
    data() {
        return {
                //
        }
    },
}
</script>