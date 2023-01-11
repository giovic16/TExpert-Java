console.log('testando file js')
// IMPORTAÇÃO
// import { msg02 } from './module/modules'

// Alternativa 1
// let modulo = await import('./module/modules.js')
// console.log(modulo.msg02)
// console.log(modulo.msgAula('JavaScript'))

// Alternativa 2
// let {msgAula, msg02} = await import('./module/modules.js')
// console.log(msgAula('JavaScript'))
// console.log(msg02)

// Alternativa 3
import { msg02, msgAula} from "./module/modules.js"
console.log(msgAula('Lógica'))

let turno1Txt, turno2Txt, setor1Txt, setor2Txt, turno1, 
    turno2, setor1, setor2, btnConfTurno, btnConfSetor

turno1 = 8
turno2 = 4

turno1Txt = document.querySelector('#func01-turno')
turno2Txt = document.querySelector('#func02-turno')
setor1Txt = document.querySelector('#func01-setor')
setor2Txt = document.querySelector('#func02-setor')

function turno(){
    turno1Txt.value = `${turno1}hs`
    document.querySelector('#info1-00 span:nth-of-type(1)').innerText = `${turno1}hs`
    turno2Txt.value = `${turno2}hs`
    document.querySelector('#info1-01 span:nth-of-type(1)').innerText = `${turno2}hs`
}
turno()

document.querySelector("#btnConfTurno").addEventListener('click',function(){
    turno1 = turno1 + turno2 //12 - 4 =
    turno2 = turno1 - turno2 // = 8 - 4 =
    turno1 = turno1 - turno2 // = 4
    turno()
}) 

setor1Txt.value = "Atendimento/Caixa"
document.querySelector('#info1-00 span:nth-of-type(2)').innerText = setor1Txt.value
setor2Txt.value = "Entrega"
document.querySelector('#info1-01 span:nth-of-type(2)').innerText = setor2Txt.value

document.querySelector("#btnConfSetor").addEventListener('click',function(){
    var tempo = setor1Txt.value
    setor1Txt.value = setor2Txt.value
    document.querySelector('#info1-00 span:nth-of-type(2)').innerText = setor1Txt.value
    setor2Txt.value = tempo
    document.querySelector('#info1-01 span:nth-of-type(2)').innerText = setor2Txt.value
}) 

let anterior = 0
document.querySelectorAll('input[type=radio]').forEach((n, i)=>{

    n.onclick = function(){
        if(n.checked){
            document.querySelector(`.dupla:nth-of-type(${(i) + 1})`).classList.remove('bg-light')
        }
        document.querySelector(`.dupla:nth-of-type(${(anterior) + 1})`).classList.add('bg-light')
        anterior = i
    }
})