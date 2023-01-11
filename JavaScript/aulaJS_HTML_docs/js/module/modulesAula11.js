
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

export {
    trocaTurno
}
