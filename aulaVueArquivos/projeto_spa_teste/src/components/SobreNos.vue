<script>
import { h } from 'vue'
function sobreInfo(titulo, url, texto){
    const vnode = 
    h('div',{class:'border p-2'},[
        h('h3',{id:'tituloSobre', class:'bg-warning text-white px-3'}, titulo),
        h('div',{class:'d-flex'}, [
            h(<p class="destaque px-2">{texto}</p>),
            h(<img src={url} class="w-50" />)
        ])
    ])
    return vnode
}
export default {
    data() {
        return{
            titulo: 'Sobre nosso restaurante',
            urlImage: require('@/assets/chef.jpg'),
            texto: 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Velit cupiditate rem dolorum quos id porro suscipit illum nobis nulla sunt.'
        }
    },
    render() {
        return sobreInfo(this.titulo, this.urlImage, this.texto)
    }
}
</script>