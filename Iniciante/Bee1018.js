let input = require('fs').readFileSync('/dev/stdin', 'utf8');
let lines = input.split('\n').map(item => parseInt(item));

let valoresNotas = [100, 50, 20, 10, 5, 2, 1];

function menorNumeroNotas(valorNota) {
    console.log(valorNota)

    for (valor of valoresNotas) {
        let quantidadeCedulas = (valorNota - (valorNota % valor)) / valor;
        valorNota = valorNota - (quantidadeCedulas * valor);
        console.log(`${quantidadeCedulas} nota(s) de R$ ${valor},00`);
    }
}

menorNumeroNotas(lines[0]);