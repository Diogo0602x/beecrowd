var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');

var A = parseInt(lines.shift());
var B = parseInt(lines.shift());

var produto = A * B;

console.log("PROD = " + produto)