package org.example.ExHerancaEncapsulamento.SistemaLanchonete;

public class SistemaLanchonete {
    public static void main(String[] args) {
        Lanche xburger = new Lanche("xBurger", 20.0, 50);
        Bebida refrigerante = new Bebida("Refrigerante", 5.0, 100);

        Relatorio relatorio = new Relatorio();

        Pedido pedido1 = new Pedido(true);
        pedido1.adicionarItem(xburger, 2);
        pedido1.adicionarItem(refrigerante, 3);

        pedido1.imprimirRecibo();
        relatorio.registrarPedido(pedido1, true);

   //     System.out.println("Estoque atualizado: " + refrigerante.getNome() + " (" + refrigerante.getEstoque() + " unidades)");
        relatorio.imprimirRelatorio();
    }
}
