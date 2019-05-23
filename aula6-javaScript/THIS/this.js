// uso de THIS


document.getElementById('btn').addEventListener("click", function () {
  console.log(this);
});


// eventos com mouse

let btnClick = document.querySelector('#btnClick');
btnClick.addEventListener('click', function(event) {
  console.log(event.clientX);
  console.log(event.clientY);
})


document.querySelector('body').addEventListener('keypress', function (event) {
  if (event.keyCode == 13) {
    alert('Você apertou enter!');
  }
});

let btnSec = document.querySelector('#btnSec');
btnSec.addEventListener('click', function () {
  setTimeout(function () {
    alert('obrigado por esperar 10 seg!');
  }, 10000);
});
