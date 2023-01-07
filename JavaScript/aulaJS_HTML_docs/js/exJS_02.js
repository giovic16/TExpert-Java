console.log('Testando JS file')

let titulo01 = document.getElementById('titulo01')
let titulo01_a = document.getElementsByClassName('titulo') //mesma classe
let titulo01_b = document.querySelector('h2')
let titulo01_c = document.querySelectorAll('h2') //mesmo nome de tag



console.log(titulo01)
console.log(titulo01_a[0])
console.log(titulo01_b.innerHTML)
console.log(titulo01_c[0].innerHTML)
console.log(titulo01_c[1].innerHTML)
titulo01_c[0].innerHTML = "Aula de Lógica! Imprimindo em tela!" //muda o texto antigo no h2 para essa nova frase
titulo01_c[0].style="color:brown"