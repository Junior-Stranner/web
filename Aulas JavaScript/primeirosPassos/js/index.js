function somar() {
  const primeiroNumero = Number(
    document.getElementById("primeiroNumero").value
  );
  const segundoNumero = Number(document.getElementById("segundoNumero").value);

  window.alert(
    "A Soma dos números inseridos é: " + (primeiroNumero + segundoNumero)
  );
}

function multiplicacao() {
  const primeiroNumero = Number(
    document.getElementById("primeiroNumero").value
  );
  const segundoNumero = Number(document.getElementById("segundoNumero").value);

  window.alert(
    "A Multiplicação dos números inseridos é: " + primeiroNumero * segundoNumero
  );
}

function dividir() {
  const primeiroNumero = Number(
    document.getElementById("primeiroNumero").value
  );
  const segundoNumero = Number(document.getElementById("segundoNumero").value);

  if (segundoNumero === 0) {
    window.alert("Não é possível dividir por zero!");
  } else {
    window.alert(
      "A Divisão dos números inseridos é: " + primeiroNumero / segundoNumero
    );
  }
}

function subtrair() {
  const primeiroNumero = Number(
    document.getElementById("primeiroNumero").value
  );
  const segundoNumero = Number(document.getElementById("segundoNumero").value);

  window.alert(
    "A Subtração dos números inseridos é: " + primeiroNumero - segundoNumero
  );
}
