function alternarTema() {
  const body = document.body;
  const btn = document.getElementById("toggleBtn");

  body.classList.toggle("bg-dark");
  body.classList.toggle("text-light");
  body.classList.toggle("bg-light");
  body.classList.toggle("text-dark");

  if (body.classList.contains("bg-dark")) {
    btn.className = "btn btn-outline-light";
    btn.textContent = "Modo Claro";
  } else {
    btn.className = "btn btn-outline-dark";
    btn.textContent = "Modo Escuro";
  }
}
