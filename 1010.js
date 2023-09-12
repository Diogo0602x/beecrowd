var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');

var peca1 = lines.shift().split(" ")
var peca2 = lines.shift().split(" ")

var codigoPeca1= parseInt(peca1.shift())
var numeroPecasPeca1 = parseInt(peca1.shift())
var valorPeca1 = parseFloat(peca1.shift())

var valorTotalPeca1 = numeroPecasPeca1 * valorPeca1

var codigoPeca2= parseInt(peca2.shift())
var numeroPecasPeca2 = parseInt(peca2.shift())
var valorPeca2 = parseFloat(peca2.shift())

var valorTotalPeca2 = numeroPecasPeca2 * valorPeca2

var valorTotalCompra = valorTotalPeca1 + valorTotalPeca2

console.log("VALOR A PAGAR: R$ " + valorTotalCompra.toFixed(2))