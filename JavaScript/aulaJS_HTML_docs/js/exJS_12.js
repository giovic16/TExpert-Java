console.log('testando file js')
// IMPORTAÇÃO
// import { msg02, msgAula} from "./module/modulesAula11.js"
// console.log(msgAula('Lógica'))

import {trocaSetor, trocaTurno} from "./module/modulesAula11.js"

let turno1Txt, turno2Txt, setor1Txt, setor2Txt, tipo1Txt, 
    tipo2Txt, setor1, setor2, btnConfTurno, btnConfSetor, 
    ativo, anterior, duplas, listOn, listOff

anterior = document.querySelector(`.dupla-0`)
ativo = 0

duplas = {
    dupla0 : ['Estela Martins','Adonis Santos'],
    dupla1 : ['Cleonildo Amarante','Pilar Detomasi'],
    dupla2 : ['Francis Albieri','Portella Afonso Silva']
}

let infoT1 = document.querySelector(`.dupla${ativo} #info1-00 span:nth-of-type(1)`)
let infoT2 = document.querySelector(`.dupla${ativo} #info1-00 span:nth-of-type(1)`)
let infoS1 = document.querySelector(`.dupla${ativo} #info1-00 span:nth-of-type(2)`)
let infoS2 = document.querySelector(`.dupla${ativo} #info1-00 span:nth-of-type(2)`)


turno1Txt = document.querySelector('#func01-turno')
turno2Txt = document.querySelector('#func02-turno')
setor1Txt = document.querySelector('#func01-setor')
setor2Txt = document.querySelector('#func02-setor')
tipo1Txt = document.querySelector('#func01-extra')
tipo2Txt = document.querySelector('#func02-extra')



trocaTurno(turno1Txt, turno2Txt, infoT1, infoT2)

document.querySelector("#btnConfTurno").addEventListener('click',function(){
    trocaTurno(turno1Txt, turno2Txt, infoT1, infoT2)
}) 

trocaSetor(setor1Txt, setor2Txt, infoS1, infoS2)

document.querySelector("#btnConfSetor").addEventListener('click',function(){
    trocaSetor(setor1Txt, setor2Txt, infoS1, infoS2)
}) 

document.querySelector("#btnConfTipoTurno").addEventListener('click',function(){
    var tempo = tipo1Txt.value
    tipo1Txt.value = tipo2Txt.value
    document.querySelector('#info1-00 span:nth-of-type(3)').innerText = tipo1Txt.value
    tipo2Txt.value = tempo
    document.querySelector('#info1-01 span:nth-of-type(3)').innerText = tipo2Txt.value
}) 


listOn = ['border','border-4','border-warning']
listOff = []
document.querySelectorAll('input[type=radio]').forEach((n, i)=>{

    n.onchange = function(){
        // i == 0 ? anterior = 1 : null
        document.querySelector(`.dupla-${i}`).classList.remove('bg-light')
        document.querySelector(`.dupla-${i}`).classList.add(...listOn)
        anterior.classList.remove(...listOn)
        anterior = document.querySelector(`.dupla-${i}`)
        // anterior = i
        ativo = i
        document.querySelector('label[for=func-01').innerText = duplas[`dupla${i}`][0]
        document.querySelector('label[for=func-02').innerText = duplas[`dupla${i}`][1]
    }
})