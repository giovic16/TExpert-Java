<script>
import { h } from 'vue'
function sobreInfo(titulo){
    const vnode = h('h3',{id:'tituloSobre', class:'border p-2 bg-warning text-white'}, titulo)
    return vnode
}
export default {
    data() {
        return{
            titulo: 'Sobre nosso restaurante'
        }
    },
    render() {
        return sobreInfo(this.titulo)
    }
}
</script>