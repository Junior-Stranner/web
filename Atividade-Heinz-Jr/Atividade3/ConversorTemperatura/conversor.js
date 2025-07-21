function converter() {
  const valor = parseFloat(document.getElementById("valor").value);
  const unidade = document.getElementById("unidade").value;
  const resultadoDiv = document.getElementById("resultado");

  function mostrarResultado(mensagem, tipo = "success") {
    resultadoDiv.innerHTML = `<div class="alert alert-${tipo}">${mensagem}</div>`;
  }

  if (isNaN(valor)) {
    mostrarResultado("Por favor, insira um valor válido!", "warning");
    return;
  }

  let resultado;
  if (unidade === "c") {
    resultado = (valor * 9) / 5 + 32;
    mostrarResultado(`${valor}°C equivalem a ${resultado.toFixed(2)}°F`);
  } else {
    resultado = ((valor - 32) * 5) / 9;
    mostrarResultado(`${valor}°F equivalem a ${resultado.toFixed(2)}°C`);
  }
}
