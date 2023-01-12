let turno1 = 8
let turno2 = 4
export let extra1 = 'Semana com exceção de feriado'
export let extra2 = 'Finais de semana e feriados'

function trocaTurno(turno1Txt, turno2Txt, info0, info1, flag){
    turno1 = turno1 + turno2 //12 - 4 =
    turno2 = turno1 - turno2 // = 8 - 4 =
    turno1 = turno1 - turno2 // = 4
    turno1Txt.value = `${turno1}hs`
    turno2Txt.value = `${turno2}hs`
    if (flag) {
        info0.innerText = `${turno1}hs`
        info1.innerText = `${turno2}hs`   
    }
}

function trocaSetor(setor1Txt, setor2Txt, setor0, setor1) {
    setor1Txt.value === setor2Txt.value && setor1Txt.value !== '' && setor2Txt.value !== '' ? alert('Escolha setores diferentes') : 
    setor0.innerText = setor1Txt.value
    setor1.innerText = setor2Txt.value
}

function trocaTipoTurno(tipo1Txt, tipo2Txt, extra0, extra1) {
    let tempo = tipo1Txt.value
    tipo1Txt.value = tipo2Txt.value
    extra0.innerText = tipo1Txt.value
    tipo2Txt.value = tempo
    extra1.innerText = tipo2Txt.value
}

export {
    trocaTurno,
    trocaSetor,
    trocaTipoTurno
}
