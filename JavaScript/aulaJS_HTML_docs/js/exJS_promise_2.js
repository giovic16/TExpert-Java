console.log('testando file js')

const btnConfirma = document.querySelector('#btnConfirma')
const nomeVisitante = document.querySelector('#nomeVisitante')
const mensagem = document.querySelector('#mensagem')
const txtConfirma = document.querySelector('#comentario')

function verificaUser() {
    document.querySelector('.user').innerText = localStorage.getItem('user')
    document.querySelector('#box02').classList.remove('hide')
    document.querySelector('#box01').classList.add('hide')
    document.querySelector('#box02 p').innerText = `Oi ${localStorage.getItem('user')}, seja bem vindo 👋😊`
}

function sair() {
    document.querySelector('#box02').classList.add('hide')
    document.querySelector('#box01').classList.remove('hide')
    document.querySelector('.user').innerText = ''
    document.querySelector('.sair').classList.add('hide')

}

function f_comentario() {
    sessionStorage.setItem('salvarTxt', txtConfirma.value)
}
sessionStorage.getItem('salvarTxt') ? txtConfirma.value = sessionStorage.getItem('salvarTxt') : null
txtConfirma.addEventListener('keyup',f_comentario)

document.querySelector('.sair').style.cursor = 'pointer'
document.querySelector('.sair').addEventListener('click',sair)

localStorage.user ? verificaUser() : null

function f_login(resolve, reject) {
    if (nomeVisitante.value === "") {
        reject(alert('Preencha o campo!'))
    }else {
        resolve(
            mensagem.style.display = "block",
            mensagem.textContent = `Oi ${nomeVisitante.value}, seja bem vindo 👋😊`,
            localStorage.setItem('user',nomeVisitante.value),
            document.querySelector('.user').innerText = localStorage.getItem('user'),
            document.querySelector('.sair').classList.remove('hide')
        )
    }
}

btnConfirma.onclick = function() {
    const login = new Promise(f_login)
    login.then(result => {result})
    .catch(erro=>{erro})
}

function info_1() {
    console.log('Atenção, verifique sua conta')
}

function info_2() {
    console.log('Atenção, hora de trocar a senha')
}

function info_3() {
    console.log('Atenção, você ganhou 100 pontos')
}

// Promise.resolve().then(()=> console.log(2), info_1())
[info_1, info_2].reduce((a, b) => a.then(b),Promise.resolve()) // as infos foram substituidas por a, b, c

const aguarde = ms => new Promise(resolve => setTimeout(resolve, ms))
aguarde(3000).then(()=> info_3()) // retorna a frase dentro de info_3 após 3s
console.log('Inicio') // imprime antes do conteúdo que está na promise
