/*
var num1 = 1;
var num2 = -3;
var num3 = 9.8;
var frase = "ola mundo";
var verdadeiro = false;

console.log(num1);
console.log(num2);
console.log(num3);
console.log(`${frase} é uma frase`);
console.log(verdadeiro+frase);

if (!verdadeiro) {
  console.log("falsissimo");
}

var x = 'Pablo';
var y = 'Barrantes';
console.log(x,y);
console.log("ola \n tudo bem?");

function a(callback) {
  console.log('a vem primeiro');
  setTimeout(function () {

    callback();
  },3000)

}
function b() {
  console.log('b vem depois');
}

a(b);

var numeros =[1,2,3,4,5,6,7,8,9,10];

numeros.forEach(function (value, index) {
  console.log('no index '+ index+ ' tem o valor de '+ value);
});

let array =[1,5,7];

var mapa = array.map(function (numero) {
  return numero *2;
});
console.log(mapa);

var array = [13,18,20];

var filtro = array.filter(function (numeros) {
  return numeros >= 14;
})
console.log(filtro);

var array =[4,5,6,];
var somaTotal = array.reduce(function (total, numero) {
  return total * numero;
})

console.log(somaTotal);
*/

var carro={
  modelo: 'corsa',
  marca:'Cevrolet',
  ano: '1996',
  ligar:function () {console.log('vrum vrum')},
  motorista:function (nome) { console.log(nome+ " esta dirigindo") }
}
console.log(carro.motorista("Pablo"));
console.log(carro.ligar());
console.log(carro.marca);
