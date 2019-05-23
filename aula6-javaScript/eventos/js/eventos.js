document.querySelector('#click').addEventListener('click',function () {
  alert('ai, você clickou em mim!!!!');
});



document.querySelector('#click2').addEventListener('mouseover',function () {
    alert('ai, você vai clickar em mim!!!!');
});


let btnClick3 = document.querySelector('#click3');

btnClick3.onclick = function () {
  if (btnClick3.style.background == "red") {
    btnClick3.style.background = "green";
  } else {
    btnClick3.style.background = 'red';
  }
}

let texto = document.querySelector('#texto');

texto.onclick = function () {
  texto.style.borderColor = "red";
}


texto.onkeydown = function (event) {
  let tecla = event.keyCode;
  console.log(tecla);
  if (tecla == 27) {
    alert("você apertou ESC!!!");
  }
}

function alerta() {
  alert("olá desde HTML!")
}
