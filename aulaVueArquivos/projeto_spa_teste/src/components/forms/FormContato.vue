<template>
    <h4 class="px-4">Entre em contato enviando sua mensagem</h4>
    <form action="" @submit="confirmar($event)" class="border p-3 w-50">
        <InputText />
        <TextArea/>
        <ButtonForm/>
    </form>
</template>

<script>
import InputText from './InputText';
import TextArea from './TextArea';
import ButtonForm from './ButtonForm';
export default {
    name: 'FormContato',
    components:{
        InputText,
        TextArea,
        ButtonForm
    },
    methods:{
        confirmar(e) {
            e.preventDefault()
            console.log(e.target.nome.value, e.target.comentarios.value)
        }
    }
}
</script>