console.log('testando file js')

let carrinho = {
    item1 : {'imagem':'salad-gf22844a91_1920.jpg', 'nome':'Salada Mix', 
             'preco':12, 'quantidade':1, 'total':1},
    item2 : {'imagem':'beef-g66eb2a540_1920.jpg', 'nome':'Carne Grelhada', 
             'preco':25, 'quantidade':1, 'total':1},
    item3 : {'imagem':'breakfast-ga9b591474_1920.jpg', 'nome':'Ovos com bacon', 
             'preco':31, 'quantidade':1, 'total':1}
}

// Buscando uma ocorrência dentro de uma string
const msgCarrinho = 'As opções são acompanhadas de batatas e arroz, com exceção das opções como caldos e sopas.'

// Encontra a ocorrência 'batatas' (citada na frase acima, msgCarrinho) e substitui pela string dentro da variavel acompanhamento
let acompanhamento01, acompanhamento02, acompanhamento03
acompanhamento01 = 'Batatas Fritas'
acompanhamento02 = 'Batatas Rústicas'
acompanhamento03 = 'Batatas Souté'
let msg01 = msgCarrinho.replace('batatas', acompanhamento01)
document.querySelector('#msgCarrinho').innerText = msg01

// Encontra a ocorrência 'opções' (citada na frase acima, msgCarrinho) e substitui pela string dentro da variavel msg02
let fraseCarrinho = document.querySelector("#msgCarrinho").innerText
let busca =/opções/g
let msg02 = fraseCarrinho.replace(busca, 'refeições')
document.querySelector('#msgCarrinho').innerText = msg02

Object.keys(carrinho).forEach((key, i)=>{
    // total = total + carrinho[key].preco
    // console.log(total)
    // document.querySelector(`.item-carrinho-${i} .item-nome span`).innerText = carrinho[key].nome
    // document.querySelector(`.item-carrinho-${i} .item-imagem`).innerHTML = `<img src='./images/produtos/${carrinho[key].imagem}' alt="salada" class='w-75'/>`
    // document.querySelector(`.item-carrinho-${i} .item-preco span`).innerText = `R$ ${carrinho[key].preco.toFixed(2)}`
    // document.querySelector(`.item-carrinho-${i} .item-total span`).innerText = `R$ ${carrinho[key].preco.toFixed(2)}`
    var divItem = document.createElement('div')
    divItem.setAttribute('class',`item-carrinho-${i} row mt-2`)
    console.log(i,'x')
        Object.keys(carrinho[key]).forEach((otherkey,ii)=>{
            var item = document.createElement('div')
            item.setAttribute('class',`col item-${otherkey}`)
            item.innerText = carrinho[key][otherkey]
            divItem.appendChild(item)
            console.log(otherkey)
        })
        document.querySelector('#itens-carrinho').appendChild(divItem)
})



// Alternativa 3
// var inputNumber = document.querySelector('.item-carrinho-0 .input-item-qtd')

// inputNumber.onchange = function() {
//     let total = carrinho['item1'].preco * this.value 
//     document.querySelector('.item-total span').innerText=`R$ ${total.toFixed(2)}`
//     console.log(this)  // no console aparece as interações realizadas na tela
// }

// Criando elementos HTML
let p = document.createElement('p')
p.style = "color:brown"
p.setAttribute('class','w-100')
p.innerText = 'Nossos alimentos passam por uma rigorosa análise de qualidade.'
document.querySelector("#mensagem").appendChild(p)

