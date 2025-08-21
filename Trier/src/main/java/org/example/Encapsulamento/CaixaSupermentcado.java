package org.example.Encapsulamento;

public class CaixaSupermentcado {
    private double totalCompra;

    public void adicionarCompra(double preco){
        if(preco > 0) {
            this.totalCompra += preco;
        }
    }

    public double getTotalCompra() {
        return totalCompra;
    }
}
