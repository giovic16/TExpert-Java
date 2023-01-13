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