let input = require('fs').readFileSync('/dev/stdin', 'utf8');
let lines = input.split('\n');

const numeroDias = parseInt(lines[0].split(' ')[0])
const saldoInicioPeriodo = parseInt(lines[0].split(' ')[1])
const movimentacoesDia = []

for (let movimentacao of lines.slice(1))
    movimentacoesDia.push(parseInt(movimentacao))

function menorSaldoPeriodo(movimentacoes, saldoInicial){
    let menorValor = saldoInicial;
    let soma = saldoInicial;

    for (let i = 0; i < movimentacoes.length; i++) {
        soma += movimentacoes[i]; 
        if (menorValor > soma) {
            menorValor = soma;
        }
    }

    return menorValor;
}

console.log(menorSaldoPeriodo(movimentacoesDia, saldoInicioPeriodo))