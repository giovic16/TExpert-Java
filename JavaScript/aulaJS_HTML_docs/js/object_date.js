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

// getMonth() 0 a 11 - 0 = janeiro | 11 = dezembro
// getDate() 0 a 6 - 0 = segunda | 6 = domingo

// 1000000/1000 - segundos = 1000
// 1000000/60000 - minutos = 16.6
// 1000000/3.6e+8 - horas = 0.27
// 1000000/8.64e+7 - dia = 0.0115
// 1000000/6.048e+8 - semana = 0.00165
