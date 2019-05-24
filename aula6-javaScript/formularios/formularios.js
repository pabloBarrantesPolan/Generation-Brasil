
function validaFormulario() {
  if (formulario.nome.value == '') {
    alert('Digite um nome:');
    formulario.nome.focus();
    return false;
    }
  if (formulario.sobrenome.value == '') {
    alert(formulario.nome.value + ', digite seu sobrenome');
    formulario.sobrenome.focus();
    return false;
  }
  if (formulario.senha1.value !== formulario.senha2.value ) {
    alert('A senha não coincide');
  }
}
