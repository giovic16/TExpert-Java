console.log('testando file js')
// IMPORTAÇÃO
// import { msg02, msgAula} from "./module/modulesAula11.js"
// console.log(msgAula('Lógica'))

import {trocaSetor, trocaTurno} from "./module/modulesAula11.js"

let turno1Txt, turno2Txt, setor1Txt, setor2Txt, tipo1Txt, 
    tipo2Txt, setor1, setor2, btnConfTurno, btnConfSetor, 
    ativo, anterior, duplas, listOn, listOff

duplas = {
    dupla0 : ['Estela Martins','Adonis Santos'],
    dupla1 : ['Cleonildo Amarante','Pilar Detomasi'],
    dupla2 : ['Francis Albieri','Portella Afonso Silva']
}

turno1Txt = document.querySelector('#func01-turno')
turno2Txt = document.querySelector('#func02-turno')
setor1Txt = document.querySelector('#func01-setor')
setor2Txt = document.querySelector('#func02-setor')
tipo1Txt = document.querySelector('#func01-extra')
tipo2Txt = document.querySelector('#func02-extra')



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

document.querySelector("#btnConfTipoTurno").addEventListener('click',function(){
    var tempo = tipo1Txt.value
    tipo1Txt.value = tipo2Txt.value
    document.querySelector('#info1-00 span:nth-of-type(3)').innerText = tipo1Txt.value
    tipo2Txt.value = tempo
    document.querySelector('#info1-01 span:nth-of-type(3)').innerText = tipo2Txt.value
}) 

anterior = 0
ativo = 0
listOn = ['border','border-4','border-warning']
document.querySelectorAll('input[type=radio]').forEach((n, i)=>{

    n.onchange = function(){
        i == 0 ? anterior = 1 : null
        // document.querySelector(`.dupla:nth-of-type(${(i) + 1})`).classList.remove('bg-light')
        // document.querySelector(`.dupla:nth-of-type(${(anterior) + 1})`).classList.add('bg-light')
        anterior = i
        ativo = i
        document.querySelector('label[for=func-01').innerText = duplas[`dupla${i}`][0]
        document.querySelector('label[for=func-02').innerText = duplas[`dupla${i}`][1]
    }
})