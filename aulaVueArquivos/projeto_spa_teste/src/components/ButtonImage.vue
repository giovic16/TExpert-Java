<template>
        <button @click="$emit('trocarImagem')" class="btn btn-info mt-4">Veja outros pratos top 10</button>
</template>

<script>
export default {
    name: 'ButtonImage',
    emits: ['trocarImagem']
}
</script>