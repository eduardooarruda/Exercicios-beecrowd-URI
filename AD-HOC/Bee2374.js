let input = require('fs').readFileSync('/dev/stdin', 'utf8');
let lines = input.split('\n').map(item => parseInt(item));

const pressaoDesejada = lines.shift()
const pressaoLida = lines.shift()

console.log(pressaoDesejada - pressaoLida)
