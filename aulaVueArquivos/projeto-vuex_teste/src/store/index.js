import { createStore } from 'vuex'

export default createStore({
  state: {
    produtos:{
      pratosQuentes:[
          {'nome':'Lazanha','preco':180},
          {'nome':'Salmão Grelhado','preco':230},
          {'nome':'Espeto de Vagetais','preco':90},
          {'nome':'Feijoada Light','preco':140},
          {'nome':'Penne ao Sugo','preco':180}
      ],
      sobremesas:[
          {'nome':'Quindim','preco':35},
          {'nome':'Bomba de Chocolate','preco':18},
          {'nome':'Petit Gateau','preco':28},
          {'nome':'Torta Holandesa','preco':34},
          {'nome':'Pudim de Leita','preco':23}
      ]
  }
  },
  getters: {
    lojaSobremesas:state => {
      let lojaSobremesas = state.produtos.sobremesas.map(
          item => { return {
          nome: item.nome, 
          preco: item.preco
      }
  })
  return lojaSobremesas
}
  },
  mutations: {
    aplicaDesconto:state => {
      state.produtos.sobremesas.forEach(
        item =>{
            item.preco = (item.preco * .9).toFixed(2)
        })
    }
  },
  actions: {
  },
  modules: {
  }
})
