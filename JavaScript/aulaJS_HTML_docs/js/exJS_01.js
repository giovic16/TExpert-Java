console.log("Testando JS file")

let nivel = 2;
let statusContrato = ""

switch (nivel) {
    case 1:
        statusContrato = 'Estagiario'
        break;
    case 2:
        statusContrato = 'Efetivado'
        break;
    default:
        statusContrato = 'Em contratação'
        break;
}

console.log(statusContrato)


let i = 0;
let y = 0;

while(i < 5){
    i++
    // if (i === 3) {
    //     continue // 1, 3, 7, 12
    // }
    // if (i === 3) {
    //     break // 1, 3
    // }
    y+=i;
    console.log(`${y}\n\++++`) // 1, 3, 6, 10, 15
}