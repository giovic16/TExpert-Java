console.log('testando file js')

// n = new Date('Dezembro 22, 1980 03:04:55') -- data inválida
n = new Date('December 22, 1980 03:04:55') // retorno ok
console.log(n)

x = new Date('1980-12-17T05:12:32')
console.log(x)

y = new Date('1980,12,14')
console.log(y)

w = new Date()
console.log(w)
// getMonth() 0 a 11 - 0 = janeiro | 11 = dezembro
// getDate() 0 a 6 - 0 = segunda | 6 = domingo