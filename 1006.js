var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');

var A = parseFloat(lines.shift())
var B = parseFloat(lines.shift())
var C = parseFloat(lines.shift())

var notaA = A * 2
var notaB = B * 3
var notaC = C * 5

var media = (notaA + notaB + notaC) / 10
console.log("MEDIA = " + media.toFixed(1))