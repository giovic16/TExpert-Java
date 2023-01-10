console.log('testando file js')

let carrinho = {
    item1 : {'imagem':'salad-gf22844a91_1920.jpg', 'nome':'Salada Mix', 
             'preco':12, 'quantidade':1, 'total':1},
    item2 : {'imagem':'beef-g66eb2a540_1920.jpg', 'nome':'Carne Grelhada', 
             'preco':25, 'quantidade':1, 'total':1},
    item3 : {'imagem':'breakfast-ga9b591474_1920.jpg', 'nome':'Ovos com bacon', 
             'preco':31, 'quantidade':1, 'total':1},
    item4 : {'imagem':'salmon-g0bb6a9f46_1920.jpg', 'nome':'Salmão Grelhado', 
             'preco':78, 'quantidade':1, 'total':1},
    'criaImagem':function(url, nome, obj){
        let imagem = new Image()
        imagem.src = url
        imagem.setAttribute('class','w-75')
        imagem.alt = nome
        obj.appendChild(imagem)
    },
    'criaInputNumber':function(obj, key, i){
        let inputNumber = document.createElement('input')
        inputNumber.type = 'number'
        inputNumber.setAttribute('class', 'w-50 border-0 bg-light')
        inputNumber.min = '0'
        inputNumber.max = '10'
        inputNumber.value = '1'
        obj.appendChild(inputNumber)

        inputNumber.onchange = function() {
            let total = carrinho[key].preco * this.value 
            document.querySelector(`.item-carrinho-${i} .item-total`).innerText=`R$ ${total.toFixed(2)}`
            console.log(this)  // no console aparece as interações realizadas na tela
        }
    },
    'criaSpan':function(key, otherkey, obj){
        var span = document.createElement('span')
        span.innerText = carrinho[key][otherkey]
        obj.appendChild(span)
    }
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
    var divItem = document.createElement('div')
    divItem.setAttribute('class',`item-carrinho-${i} row mt-2`)

    console.log(i,'x')
        Object.keys(carrinho[key]).forEach((otherkey,ii)=>{
            var item = document.createElement('div')
            item.setAttribute('class',`col item-${otherkey}`)
            ii === 0 ? carrinho['criaImagem'](`./images/produtos/${carrinho[key].imagem}`, carrinho[key].nome,item) :
            ii === 3 ? carrinho['criaInputNumber'](item, key, i) :
            carrinho['criaSpan'](key, otherkey, item)
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

