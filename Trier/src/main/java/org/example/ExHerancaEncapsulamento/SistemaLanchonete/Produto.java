package org.example.ExHerancaEncapsulamento.SistemaLanchonete;

public abstract class Produto {
    private String nome;
    private static double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }


    public void reduzirEstoque(int quantidade) {
        if (quantidade > estoque) {
            System.out.println("Estoque insuficiente para: "+nome);
            return;
        }
        estoque -= quantidade;
    }

    public abstract double calcularPreco(int quantidade);

    @Override
    public String toString() {
        return nome;
    }
}
