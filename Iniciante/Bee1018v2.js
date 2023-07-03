let input = require('fs').readFileSync('/dev/stdin', 'utf8');
let lines = input.split('\n').map(item => parseInt(item));

let valor = lines[0];
let nota;

function quantidadeNotas(nota) {
    return function (valor) {
        return (valor - (valor % nota)) / nota
    }
}

console.log(valor);

let quantidadeNotasCem = quantidadeNotas(100);
nota = quantidadeNotasCem(valor);
valor = valor - (nota * 100);
console.log(`${nota} nota(s) de R$ 100,00`);

let quantidadeNotasCinquenta = quantidadeNotas(50);
nota = quantidadeNotasCinquenta(valor);
valor = valor - (nota * 50);
console.log(`${nota} nota(s) de R$ 50,00`);

let quantidadeNotasVinte = quantidadeNotas(20);
nota = quantidadeNotasVinte(valor);
valor = valor - (nota * 20);
console.log(`${nota} nota(s) de R$ 20,00`);

let quantidadeNotasDez = quantidadeNotas(10);
nota = quantidadeNotasDez(valor)
valor = valor - (nota * 10);
console.log(`${nota} nota(s) de R$ 10,00`);

let quantidadeNotasCinco = quantidadeNotas(5);
nota = quantidadeNotasCinco(valor);
valor = valor - (nota * 5);
console.log(`${nota} nota(s) de R$ 5,00`);

let quantidadeNotasDois = quantidadeNotas(2);
nota = quantidadeNotasDois(valor)
valor = valor - (nota * 2);
console.log(`${nota} nota(s) de R$ 2,00`);

let quantidadeNotasUm = quantidadeNotas(1);
nota = quantidadeNotasUm(valor)
valor = valor - (nota * 1);
console.log(`${nota} nota(s) de R$ 1,00`);
