let input = require('fs').readFileSync('/dev/stdin', 'utf8');
let lines = input.split('\n').map(item => parseInt(item));

function fatorial(numero) {
    if (numero === 1) {
        return 1;
    }
    
    return numero * fatorial(numero-1)
}

console.log(fatorial(lines.shift()));