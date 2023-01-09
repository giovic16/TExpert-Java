console.log('teste js file')

let carrinho = {
    item1 : {'nome':'Salada Mix', 'preco':12},
    item2 : {'nome':'Carne Grelhada', 'preco':25},
    item3 : {'nome':'Ovos com bacon', 'preco':31}
}

document.querySelector('.item-nome span').innerText = carrinho['item1'].nome
document.querySelector('.item-preco span').innerText = `R$ ${carrinho['item1'].preco.toFixed(2)}`
document.querySelector('.item-imagem').innerHTML = `<img src="./images/produtos/salad-gf22844a91_1920.jpg" alt="salada" class='w-50'/>`

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