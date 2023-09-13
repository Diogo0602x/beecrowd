var input = require('fs').readFileSync('stdin', 'utf8');

var [km, litro] = input.split("\n").map(item => parseFloat(item));

var consumo = km / litro 

console.log(consumo.toFixed(3) + " km/l")
