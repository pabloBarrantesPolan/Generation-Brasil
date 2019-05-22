// seletores

document.getElementById('titular').style.display = 'none';

document.querySelector('#lechuza').style.filter = 'grayscale(100%)';

document.querySelectorAll('input').forEach(function (items) {
  items.style.background = 'red';
});

// DOM - seletores e atributos
console.log(document.getElementById('copyright').attributes);

console.log(document.querySelector('.fa-twitter').getAttribute('href'));

console.log(document.querySelector('.fa-facebook').getAttribute('href'));

document.querySelector('.fa-youtube').setAttribute('href', 'https://www.youtube.com/channel/UCRQdwmWMhTcqDFjPT4UPZYA' );

console.log(document.querySelector('.formulario').hasAttribute('action'));

let url = document.querySelector('.formulario');
url.setAttribute('action', url.getAttribute('url'));
url.removeAttribute('url');

document.querySelectorAll('h2').forEach(function (items) {
  items.style.color = 'red';
});

document.querySelectorAll('.icon').forEach(function (items) {
  items.style.background = 'blue';
});

document.getElementById('top').textContent='Topo';
document.getElementById('work').textContent='Trabalhos';
document.getElementById('portfolio').textContent='Portólio';
document.getElementById('contact').textContent='Contato';

let pai = document.querySelector('.social');
let filho = pai.children.item(3);
pai.removeChild(filho);

// EVENTOS
 let click = document.querySelector('#abracadabra');
 click.addEventListener('click', function () {
   alert('Ai! você clicou em mim!!!!');
 });
