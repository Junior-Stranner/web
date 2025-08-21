package org.example.ExHerancaEncapsulamento.SistemaLanchonete;

class Lanche extends Produto {
    public Lanche(String nome, double preco, int estoque) {
        super(nome, preco, estoque);
    }

    @Override
    public double calcularPreco(int quantidade) {
        return getPreco() * quantidade;
    }
}
