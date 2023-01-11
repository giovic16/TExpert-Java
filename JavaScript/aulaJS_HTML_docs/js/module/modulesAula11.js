
let turno1 = 8
let turno2 = 4

function trocaTurno(turno1Txt, turno2Txt, info0, info1){
    turno1 = turno1 + turno2 //12 - 4 =
    turno2 = turno1 - turno2 // = 8 - 4 =
    turno1 = turno1 - turno2 // = 4
    turno1Txt.value = `${turno1}hs`
    info0.innerText = `${turno1}hs`
    turno2Txt.value = `${turno2}hs`
    info1.innerText = `${turno2}hs`
}

function trocaSetor(setor1Txt, setor2Txt, setor0, setor1) {
    setor1Txt.value === setor2Txt.value && setor1Txt.value !== '' && setor2Txt.value !== '' ? alert('Escolha setores diferentes') : 
    setor0.innerText = setor1Txt.value
    setor1.innerText = setor2Txt.value
}

export {
    trocaTurno,
    trocaSetor
}
