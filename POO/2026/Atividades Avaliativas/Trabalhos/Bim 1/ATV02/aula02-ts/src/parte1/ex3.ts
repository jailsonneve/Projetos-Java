var a = 10;
let b = 20;
const c = 30;

b = 50;
// c = 40; Errado, pois "const" significa constante, ou seja, não pode ser alterada/atribuida um novo valor.

console.log(a, b, c);