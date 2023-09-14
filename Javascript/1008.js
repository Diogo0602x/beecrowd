var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');

var numero = parseInt(lines.shift());
var horasTrabalhadas = parseInt(lines.shift());
var salarioPorHora = parseFloat(lines.shift());

var salario = horasTrabalhadas * salarioPorHora

console.log("NUMBER = " + numero)
console.log("SALARY = U$ " + salario.toFixed(2))