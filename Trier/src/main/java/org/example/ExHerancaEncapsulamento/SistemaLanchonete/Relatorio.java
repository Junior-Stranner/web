package org.example.ExHerancaEncapsulamento.SistemaLanchonete;

class Relatorio {
    private int totalPedidos = 0;
    private double totalArrecadado = 0;

    public void registrarPedido(Pedido pedido,  boolean comTaxaServico) {
        totalPedidos++;
        totalArrecadado += pedido.calcularTotal(comTaxaServico);
    }

    public void imprimirRelatorio() {
        System.out.println("Relatório diário: " + totalPedidos + " pedidos, " + totalArrecadado + " reais arrecadados");
    }
}
