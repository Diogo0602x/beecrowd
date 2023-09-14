var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');

var peca1 = lines.shift().split(" ")
var peca2 = lines.shift().split(" ")

var [codigoPeca1, numeroPecasPeca1, valorPeca1]= parseInt(peca1.shift())
var [codigoPeca2, numeroPecasPeca2, valorPeca2]= parseInt(peca1.shift())

var valorTotalPeca1 = numeroPecasPeca1 * valorPeca1

var valorTotalPeca2 = numeroPecasPeca2 * valorPeca2

var valorTotalCompra = valorTotalPeca1 + valorTotalPeca2

console.log("VALOR A PAGAR: R$ " + valorTotalCompra.toFixed(2))