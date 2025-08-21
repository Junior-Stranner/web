package org.example.Encapsulamento;

public class SuperMercadoMain {
    public static void main(String[] args) {
        CaixaSupermentcado caixinha = new CaixaSupermentcado();
        caixinha.adicionarCompra(10.50);
        caixinha.adicionarCompra(5.30);

        System.out.println("Total da compra: "+ caixinha.getTotalCompra());
    }
}
