document.getElementById('btnOla').addEventListener('click', function () {
  alert('Olá')
});


document.getElementById('btnFundo').addEventListener('click', function () {
    let fundo = document.querySelector('body');
    fundo.style.background = 'green';
});

function vendoImagem() {
  console.log('Estou vendo a imagem');
}

document.getElementById('imgClick').addEventListener('click', function () {
  alert('Estou clickando na imagem');
});

function alteraFundo() {
  this.style.background = "red";
}

document.body.addEventListener('click', alteraFundo);

document.body.removeEventListener('click', alteraFundo);

function errou(event) {
  event.preventDefault();
  alert('Não é possivel enviar');
}

document.getElementById('imgClick').addEventListener('mouseover', function (event) {

  console.log("o mouse está em " + event.clientX + "x e " + event.clientY +"y" );
});


// eventos com Timer

function conta10() {
  setTimeout(function () {
    alert('Tempo esgotado!');
  }, 10000);
}


// revisar o ciclo...
function contador() {
  alert("Hora do intervalo!");
}
