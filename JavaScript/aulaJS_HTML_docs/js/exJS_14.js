console.log('testando file js')

let a = '94328573472'
let email = 'usuario_thebest@mail.com.br'
let n = 4
console.log(a.padStart(a.length + 2, "0")) // adiciona dois 0 na frente da string a
console.log(a.padEnd(a.length + 2, "0")) // adiciona dois 0 no final da string a
console.log(n.toString().length == 1 ? `0${n}` : n) // adiciona 0 no inicio do n
console.log(n.toString().length == 1 ? n.toString().padStart(2,'0') : n) // adiciona 0 no inicio do n

let ultimosDiigitos = a.slice(-4)
let mascara = ultimosDiigitos.padStart(a.length, '*')
console.log(ultimosDiigitos)
console.log(mascara)
document.querySelector('.p1').innerHTML = `Número do cartão: ${a} <br/> cartão com máscara: ${mascara}`

let antes = email.substring(0, email.indexOf('@'))
let depois = email.substring(email.indexOf('@'), email.length)
let primeirasLetras = antes.slice(antes.length / 2) 
let antesMask = primeirasLetras.padStart(antes.length,'+')
console.log(antes)
console.log(depois)
console.log(primeirasLetras)
console.log(`${antesMask}${depois}`)
document.querySelector('.p2').innerHTML = `Email: ${email} <br/> Email com máscara ${antesMask}${depois}`
// let primeirasLetras = antes.slice(4) // remove as primeiras 4 letras do email
// let antesMask = antes.padStart(antes.length)

// MATH
let nn = 13.4
console.log(Math.sqrt(16))
let paraBaixo = Math.floor(nn) // arredonda para 13
let paraCima= Math.ceil(nn) // arredonda para 14
let arredondamento = Math.round(nn) // <= 13.4 arredonda para 13 / >= 13.5 arredonda para 14
console.log('Math.floor - Para o mais baixo valor', paraBaixo)
console.log('Math.ceil - Para o mais alto valor', paraCima)
console.log('Math.round - Arrendonda (para baixo até .49, além disso para cima)', arredondamento)

let c = Math.random().toString(36).substring(2, 9) // gera 7 números com letras, ex: 9o6pq1blsgj
console.log(c)

document.querySelector('.p3').innerHTML = `O código é <b>${c}</b>`

// let c = Math.random() * 100
// let x = Math.random().toString(36) // gera números com letras com ponto, ex: 0.8rhqoeun69f
// let x = Math.random().toString(36).substring(2) // gera números com letras removendo o ponto, ex: l4y83eyw8r
