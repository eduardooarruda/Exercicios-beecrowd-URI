let input = require('fs').readFileSync('/dev/stdin', 'utf8');
let lines = input.split('\n').map(item => parseInt(item));

function calcularNota(nota) {
    if (nota === 0) return 'F'
    else if (nota >= 1 && nota <= 35) return 'D'
    else if (nota >= 36 && nota <= 60) return 'C'
    else if (nota >= 61 && nota <= 85) return 'B'
    else if (nota >= 86 && nota <= 100) return 'A'
}

console.log(calcularNota(lines.shift()))