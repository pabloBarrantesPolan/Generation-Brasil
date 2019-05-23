document.getElementById('btnOla').addEventListener('click', function () {
  alert('Olá')
});


document.getElementById('btnFundo').addEventListener('click', function () {
    let fundo = document.querySelector('body');
    fundo.style.background = 'green';
});

function vendoImagem() {
  alert('Estou vendo a imagem');
}

document.getElementById('imgClick').addEventListener('click', function () {
  alert('Estou clickando na imagem');
});

// document.querySelector('body').addEventListener('click', function () {
//   this.style.background = 'red';
// });

function errou(event) {
  alert('Não é possivel enviar');
  event.preventDefault();
}

document.getElementById('imgClick').addEventListener('mouseover', function (event) {
  let x = event.clientX;
  let y = event.clientY;
  console.log("o mouse está em " + x + "x e " + y +"y" );
});


// eventos com Timer


function conta10() {
  setTimeout(function () {
    alert('Tempo esgotado!');
  }, 10000);
}


// revisar o ciclo...

while () {
  setTimeout(function () {
    alert("Hora do intervalo")
  }, 5000);
}
