console.log('testando file js')
// IMPORTAÇÃO
// import { msg02, msgAula} from "./module/modulesAula11.js"
// console.log(msgAula('Lógica'))

import {trocaSetor, trocaTurno} from "./module/modulesAula11.js"

let turno1Txt, turno2Txt, setor1Txt, setor2Txt, 
    setor1, setor2, btnConfTurno, btnConfSetor

turno1Txt = document.querySelector('#func01-turno')
turno2Txt = document.querySelector('#func02-turno')
setor1Txt = document.querySelector('#func01-setor')
setor2Txt = document.querySelector('#func02-setor')


trocaTurno(turno1Txt, 
           turno2Txt,
           document.querySelector('#info1-00 span:nth-of-type(1)'),
           document.querySelector('#info1-01 span:nth-of-type(1)'))

document.querySelector("#btnConfTurno").addEventListener('click',function(){
    trocaTurno(turno1Txt, 
               turno2Txt,
               document.querySelector('#info1-00 span:nth-of-type(1)'),
               document.querySelector('#info1-01 span:nth-of-type(1)'))
}) 

trocaSetor(setor1Txt, 
           setor2Txt, 
           document.querySelector('#info1-00 span:nth-of-type(2)'),
           document.querySelector('#info1-01 span:nth-of-type(2)'))

document.querySelector("#btnConfSetor").addEventListener('click',function(){
    trocaSetor(setor1Txt, 
               setor2Txt, 
               document.querySelector('#info1-00 span:nth-of-type(2)'),
               document.querySelector('#info1-01 span:nth-of-type(2)'))
}) 

// document.querySelector("#btnConfSetor").addEventListener('click',function(){
//     var tempo = setor1Txt.value
//     setor1Txt.value = setor2Txt.value
//     document.querySelector('#info1-00 span:nth-of-type(2)').innerText = setor1Txt.value
//     setor2Txt.value = tempo
//     document.querySelector('#info1-01 span:nth-of-type(2)').innerText = setor2Txt.value
// }) 

let anterior = 0
document.querySelectorAll('input[type=radio]').forEach((n, i)=>{

    n.onclick = function(){
        i == 0 ? anterior = 1 : null
        if(n.checked){
            document.querySelector(`.dupla:nth-of-type(${(i) + 1})`).classList.remove('bg-light')
        }
        document.querySelector(`.dupla:nth-of-type(${(anterior) + 1})`).classList.add('bg-light')
        anterior = i
    }
})