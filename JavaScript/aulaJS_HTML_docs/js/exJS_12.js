console.log('testando file js')
// IMPORTAÇÃO
// import { msg02, msgAula} from "./module/modulesAula11.js"
// console.log(msgAula('Lógica'))

import {trocaSetor, trocaTurno, trocaTipoTurno, extra1, extra2} from "./module/modulesAula11.js"

let turno1Txt, turno2Txt, setor1Txt, setor2Txt, tipo1Txt, 
    tipo2Txt, setor1, setor2, anterior, duplas, listOn,
    infoT1, infoT2, infoS1, infoS2, infoTt1, infoTt2

anterior = document.querySelector(`.dupla-0`)
var ativo = 0

duplas = {
    dupla0 : ['Estela Martins','Adonis Santos'],
    dupla1 : ['Cleonildo Amarante','Pilar Detomasi'],
    dupla2 : ['Francis Albieri','Portella Afonso Silva']
}

function infos(ativo) {
    infoT1 = document.querySelector(`.dupla${ativo} #info1-00 span:nth-of-type(1)`)
    infoT2 = document.querySelector(`.dupla${ativo} #info1-01 span:nth-of-type(1)`)
    infoS1 = document.querySelector(`.dupla${ativo} #info1-00 span:nth-of-type(2)`)
    infoS2 = document.querySelector(`.dupla${ativo} #info1-01 span:nth-of-type(2)`)   
    infoTt1 = document.querySelector(`.dupla${ativo} #info1-00 span:nth-of-type(3)`)
    infoTt2 = document.querySelector(`.dupla${ativo} #info1-01 span:nth-of-type(3)`)  
}

turno1Txt = document.querySelector('#func01-turno')
turno2Txt = document.querySelector('#func02-turno')
setor1Txt = document.querySelector('#func01-setor')
setor2Txt = document.querySelector('#func02-setor')
tipo1Txt = document.querySelector('#func01-extra')
tipo2Txt = document.querySelector('#func02-extra')


infos(ativo)
trocaTurno(turno1Txt, turno2Txt, infoT1, infoT2, false)

document.querySelector("#btnConfTurno").addEventListener('click',function(){
    infos(ativo)
    trocaTurno(turno1Txt, turno2Txt, infoT1, infoT2, true)
}) 

trocaSetor(setor1Txt, setor2Txt, infoS1, infoS2)
document.querySelector("#btnConfSetor").addEventListener('click',function(){
    infos(ativo)
    trocaSetor(setor1Txt, setor2Txt, infoS1, infoS2)
}) 

document.querySelector('#func01-extra').value = extra1
document.querySelector('#func02-extra').value = extra2

document.querySelector("#btnConfTipoTurno").addEventListener('click',function(){
    infos(ativo)
    trocaTipoTurno(tipo1Txt, tipo2Txt, infoTt1, infoT2)
}) 


listOn = ['border','border-4','border-warning']
document.querySelector(`.dupla-0`).classList.remove('bg-light')
document.querySelector(`.dupla-0`).classList.add(...listOn)

document.querySelectorAll('input[type=radio]').forEach((n, i)=>{

    n.onchange = function(){
        document.querySelector(`.dupla-${i}`).classList.remove('bg-light')
        document.querySelector(`.dupla-${i}`).classList.add(...listOn)
        anterior.classList.remove(...listOn)
        anterior.classList.add('bg-light')
        anterior = document.querySelector(`.dupla-${i}`)
        ativo = i
        document.querySelector('label[for=func-01]').innerText = duplas[`dupla${i}`][0]
        document.querySelector('label[for=func-02]').innerText = duplas[`dupla${i}`][1]
    }
})