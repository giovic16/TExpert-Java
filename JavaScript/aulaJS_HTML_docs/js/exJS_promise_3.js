console.log('testando file js')

function f_carregaTxt(resolve, reject) {
    let requisicao = new XMLHttpRequest()
    requisicao.open('GET','./src/files/arquivo1.txt')
    requisicao.onload = function() {
        requisicao.status == 200 ? resolve(
            document.querySelector('.conteudo').innerHTML = requisicao.response) : reject('Algo deu errado. Seu arquivo não foi carregado')
    }
    requisicao.send()
}
const carregaTxt = new Promise(f_carregaTxt)

carregaTxt.then(result =>{result})
.catch(erro =>{console.log(erro)})

//async await
async function saudacao() {
    const m = await 'Olá, tudo bem?'
    return m
}
saudacao().then(result =>{console.log(result)})

async function despedida(msg) {
    const tchau = await msg
    return msg
}
despedida('Estou indo').then(result =>{console.log(result)})

function carregaEm5Segundos(x) {
    return new Promise(resolve => {
        setTimeout(()=>{resolve(x)}, 5000)
    }
)}

async function verificaCarregamento() {
    const x = await carregaEm5Segundos('Arquivo ok!')
    console.log(x)
}
verificaCarregamento()