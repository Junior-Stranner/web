document
  .getElementById("form-cliente")
  .addEventListener("submit", function (e) {
    e.preventDefault();

    const nome = document.getElementById("nome").value;
    const email = document.getElementById("email").value;

    const novoCliente = { nome, email };

    let clientes = JSON.parse(localStorage.getItem("clientes")) || [];
    clientes.push(novoCliente);
    localStorage.setItem("clientes", JSON.stringify(clientes));

    document.getElementById("form-cliente").reset();
    listarClientes();
  });

function listarClientes() {
  const container = document.getElementById("lista-clientes");
  container.innerHTML = "";

  const clientes = JSON.parse(localStorage.getItem("clientes")) || [];

  if (clientes.length === 0) {
    container.innerHTML = "<p>Nenhum cliente cadastrado.</p>";
    return;
  }

  clientes.forEach((cliente) => {
    const div = document.createElement("div");
    div.className = "cliente";
    div.innerHTML = `<strong>Cliente: ${cliente.nome}</strong><br>Email: ${cliente.email}`;
    container.appendChild(div);
  });
}

window.addEventListener("DOMContentLoaded", listarClientes);
