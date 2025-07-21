function renderProducts(list) {
  const container = document.getElementById("productsContainer");
  container.innerHTML = "";
  list.forEach((product) => {
    container.innerHTML += `
      <div class="col-md-4 mb-3">
        <div class="card">
          <div class="card-body">
            <h5 class="card-title">${product.nome}</h5>
            <p class="card-text">Preço: R$ ${product.preco}</p>
            <span class="badge bg-secondary">${product.categoria}</span>
          </div>
        </div>
      </div>
    `;
  });
}
