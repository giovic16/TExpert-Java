console.log('testando file js')

let carrinho = {
    item1 : {'nome':'Salada Mix', 'preco':12},
    item2 : {'nome':'Carne Grelhada', 'preco':25},
    item3 : {'nome':'Ovos com bacon', 'preco':31}
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



document.querySelector('.item-nome span').innerText = carrinho['item1'].nome
document.querySelector('.item-preco span').innerText = `R$ ${carrinho['item1'].preco.toFixed(2)}`
document.querySelector('.item-imagem').innerHTML = `<img src="./images/produtos/salad-gf22844a91_1920.jpg" alt="salada" class='w-50'/>`

// Percorrendo o objeto-array
// Exemplo 1
for (const key of Object.keys(carrinho)) {
    //console.log(key) // retorna o nome da variável
    //console.log(carrinho[key].nome) // retorna o nome da variável + o nome dos itens detro dela

}

// Exemplo 2
let total = 0
Object.keys(carrinho).forEach((key)=>{
    total = total + carrinho[key].preco
    console.log(total)
    console.log(key)
    console.log(carrinho[key].nome)
})

// Alternativa 1
// var inputNumber = document.querySelector('.input-item-qtd')

// inputNumber.addEventListener('change',() =>{
//     let total = carrinho['item1'].preco * inputNumber.value
//     document.querySelector('.item-total span').innerText=`R$ ${total.toFixed(2)}`
//     console.log(this.inputNumber) // no console aparece as interações realizadas na tela
// })

// Alternativa 2
// var inputNumber = document.querySelector('.input-item-qtd')

// inputNumber.addEventListener('change',(e) =>{
//     let total = carrinho['item1'].preco * e.target.value // e.target "substitui" o inputNumber
//     document.querySelector('.item-total span').innerText=`R$ ${total.toFixed(2)}`
//     console.log(e.target)  // no console aparece as interações realizadas na tela
//     console.log(e) // retorna eventos no console
// })

// Alternativa 3
var inputNumber = document.querySelector('.input-item-qtd')

inputNumber.onchange = function() {
    let total = carrinho['item1'].preco * this.value 
    document.querySelector('.item-total span').innerText=`R$ ${total.toFixed(2)}`
    console.log(this)  // no console aparece as interações realizadas na tela
}

// Alternativa 4
// var inputNumber = document.querySelector('.input-item-qtd')

// inputNumber.onchange = (e) => {
//     let total = carrinho['item1'].preco * e.target.value // e.target "substitui" o inputNumber
//     document.querySelector('.item-total span').innerText=`R$ ${total.toFixed(2)}`
//     console.log(this)  // no console aparece as interações realizadas na tela
// }