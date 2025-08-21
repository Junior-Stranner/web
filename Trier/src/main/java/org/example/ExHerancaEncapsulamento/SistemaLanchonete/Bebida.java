package org.example.ExHerancaEncapsulamento.SistemaLanchonete;

class Bebida extends Produto {
    public Bebida(String nome, double preco, int estoque) {
        super(nome, preco, estoque);
    }

    @Override
    public double calcularPreco(int quantidade) {
        int pago = (quantidade / 3) * 2 + (quantidade % 3);
        return pago * getPreco();
    }
}
