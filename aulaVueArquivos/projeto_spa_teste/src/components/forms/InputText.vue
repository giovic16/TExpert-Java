<template>
    <input class="d-block mb-3" type="text" :id="nameTxt" :name="nomeTxt" :placeholder="placeholder">
</template>

<script>
export default {
    name: 'InputText',
    props:{
        nameTxt:{
            type:String,
            default: 'Definir o campo'
        },
        placeholder:{
            type:String,
            default: 'Preencha este campo'
        }
    }
}
</script>