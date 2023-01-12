console.log('testando file js')

// n = new Date('Dezembro 22, 1980 03:04:55') -- data inválida
n = new Date('December 22, 1980 03:04:55') // retorno ok
console.log(n)

x = new Date('1980-12-17T05:12:32')
console.log(x)

y = new Date('1980,12,14')
console.log(y)

w = new Date()
console.log(w.getTime())

let meses = ['Jan','Fev','Mar','Abr','Mai','Jun','Jul','Ago','Set','Out','Nov','Dez']
let semana = ['Dom','Seg','Ter','Qua','Qui','Sex','Sab',]

function dataDeHoje_nomes() {
    let hoje = new Date()
    let diaDaSemana = hoje.getDay()
    let diaDoMes = hoje.getDate().toString()
    diaDoMes = diaDoMes.length == 1 ? `0${diaDoMes}` : diaDoMes 
    let mesDoAno = hoje.getMonth().toString()
    mesDoAno = mesDoAno.length == 1 ? `0${mesDoAno}`: mesDoAno
    let anoAtual = hoje.getFullYear()
    let dataAtual = `São Paulo, ${diaDoMes}, ${semana[diaDaSemana]} de ${meses[Number(mesDoAno)]} de ${anoAtual}`
    return dataAtual
}
document.querySelector('.p1').innerText = dataDeHoje()
document.querySelector('.p2').innerText = dataDeHoje_nomes()


function dataDeHoje() {
    let hoje = new Date()
    let diaDaSemana = hoje.getDate()
    let diaDoMes = hoje.getDay().toString()
    diaDoMes = diaDoMes.length == 1 ? `0${diaDoMes}` : diaDoMes 
    let mesDoAno = hoje.getMonth().toString()
    mesDoAno = mesDoAno.length == 1 ? `0${mesDoAno}`: mesDoAno
    let anoAtual = hoje.getFullYear()
    let dataAtual = `${diaDoMes}/${mesDoAno}/${anoAtual}`
    return dataAtual
}
console.log(dataDeHoje())

function inicio() {
    let tempo = new Date()
    inicio = tempo.getTime()
    console.log(inicio)
    return inicio
}
let tempoInicial = inicio()

document.querySelector('#btnFim').addEventListener('click',()=>{
    let fim = Date.now()
    let tempoDecorrido = `${(fim - tempoInicial)/1000} segundos`
    document.querySelector('.p3').innerText = tempoDecorrido
})
// getMonth() 0 a 11 - 0 = janeiro | 11 = dezembro
// getDay() 0 a 6 - 0 = domingo | 6 = sabado
// getDate() dia do mês
// getFullYear() ano

// 1000000/1000 - segundos = 1000
// 1000000/60000 - minutos = 16.6
// 1000000/3.6e+8 - horas = 0.27
// 1000000/8.64e+7 - dia = 0.0115
// 1000000/6.048e+8 - semana = 0.00165
