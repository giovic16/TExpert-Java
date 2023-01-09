console.log('Teste file js')

let turno1Txt, turno2Txt, setor1Txt, setor2Txt, turno1, 
    turno2, setor1, setor2, btnConfTurno, btnConfSetor

turno1 = 8
turno2 = 4

turno1Txt = document.querySelector('#func01-turno')
turno2Txt = document.querySelector('#func02-turno')
setor1Txt = document.querySelector('#func01-setor')
setor2Txt = document.querySelector('#func02-setor')

turno1Txt.value = `${turno1}hs`
turno2Txt.value = `${turno2}hs`

document.querySelector("#btnConfTurno").addEventListener('click',function(){
    turno1 = turno1 + turno2 //12 - 4 =
    turno2 = turno1 - turno2 // = 8 - 4 =
    turno1 = turno1 - turno2 // = 4
    turno1Txt.value = `${turno1}hs`
    turno2Txt.value = `${turno2}hs`
}) 

// document.querySelector("#btnConfTurno").addEventListener('click',function(){
//     turno1 = turno1 + turno2 //22 - 7 =
//     turno2 = turno1 - turno2 // = 15 - 22 =
//     turno1 = turno1 - turno2 // = 4
//     turno1Txt.value = `${turno1}hs`
//     turno2Txt.value = `${turno2}hs`
// }) 

// document.querySelector("#btnConfTurno").addEventListener('click',function(){
//     tempo = turno1
//     turno1 = turno2
//     turno2 = tempo
//     turno1Txt.value = `${turno1}hs`
//     turno2Txt.value = `${turno2}hs`
// }) 

setor1Txt.value = "Atendimento"
setor2Txt.value = "Entrega"
document.querySelector("#btnConfSetor").addEventListener('click',function(){
    tempo = setor1Txt.value
    setor1Txt.value = setor2Txt.value
    setor2Txt.value = tempo
}) 