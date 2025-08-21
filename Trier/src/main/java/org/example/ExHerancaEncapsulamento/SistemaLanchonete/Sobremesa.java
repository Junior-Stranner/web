package org.example.ExHerancaEncapsulamento.SistemaLanchonete;

public class Sobremesa extends Produto {
    public Sobremesa(String nome, double preco, int estoque) {
        super(nome, preco, estoque);
    }

    @Override
    public double calcularPreco(int quantidade) {
        return getPreco() * quantidade;
    }
}
