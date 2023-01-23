<template>
    <h1 ref="title">Bora codar com {{ vue }} JS!</h1>
</template>

<script>
    export default {
        name: 'MeuComp',
        data() {
            return{
                vue: 'Vue 4'
            }
        },
        // beforeCreate() {
        //     console.log('beforeCreate', '- antes de criar a instância Vue')
        //     console.log('Data', this.vue)
        //     console.log('DOM', this.$refs.title)
        // },
        // created() {
        //     console.log('Create', ' - instância criada')
        //     console.log('Data', this.vue)
        //     console.log('DOM', this.$refs.title)
        // }
        // beforeMount() {
        //     console.log('beforeMount', '- antes de montar o elemento')
        //     console.log('Data', this.vue)
        //     console.log('DOM', this.$refs.title)
        // },
        // mounted() {
        //     console.log('Mounted', ' - montagem concluída')
        //     console.log('Data', this.vue)
        //     console.log('DOM', this.$refs.title)
        // }
        // beforeUpdate() {
        //     console.log('beforeUpdate', '- antes de atualizar os dados')
        //     console.log('Data', this.vue)
        //     console.log('DOM', this.$refs.title)
        // },
        // updated() {
        //     console.log('Updated', ' - atualização concluída')
        //     console.log('Data', this.vue)
        //     console.log('DOM', this.$refs.title)
        // }
        beforeUnmount() {
            console.log('beforeMount', '- antes de desmontar o elemento')
            console.log('Data', this.vue)
            console.log('DOM', this.$refs.title)
        },
        unmounted() {
            console.log('Mounted', ' - desmontagem concluída')
            console.log('Data', this.vue)
            console.log('DOM', this.$refs.title)
        }
        
    }
</script>