function filterProducts(category) {
  const filtered =
    category === "all"
      ? products
      : products.filter((p) => p.categoria === category);
  renderProducts(filtered);
}

renderProducts(products);
