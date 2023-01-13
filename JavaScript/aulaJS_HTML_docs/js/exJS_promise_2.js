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

// PROMISES
// let info = true // retorna resolve
// // let info = false - retorna reject
// function principal(resolve, reject) {
//     info ? resolve('Deu certo!',
//     document.querySelector('#titulo01').innerText = 'EX_18 Javascript') : reject('Aconteceu algo errado!')
// }
// const minhaPromise = new Promise(principal)

// minhaPromise.then(m => {
//     console.log('Então', m)
// }).catch(err => {
//     console.log('Então', err) // executada quando info for false
// })

