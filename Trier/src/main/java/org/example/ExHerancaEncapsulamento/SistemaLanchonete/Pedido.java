package org.example.ExHerancaEncapsulamento.SistemaLanchonete;

import java.util.ArrayList;
import java.util.List;

class Pedido {
    private static int contador = 100;
    private int numero;
    private List<ItemPedido> itens = new ArrayList<>();
    private boolean cobrarServico;

    public Pedido(boolean cobrarServico) {
        this.numero = ++contador;
        this.cobrarServico = cobrarServico;
    }

    public void adicionarItem(Produto produto, int quantidade) {
        itens.add(new ItemPedido(produto, quantidade));
    }

    public double calcularTotal(boolean comTaxaServico) {
        double subtotal = 0.0;
        for (ItemPedido item : itens) {
            subtotal += item.getProduto().calcularPreco(item.getQuantidade());
        }
        if (comTaxaServico) subtotal *= 1.10;
        return subtotal;
    }


    public void finalizarPedido() {
        for (ItemPedido item : itens) {
            item.getProduto().reduzirEstoque(item.getQuantidade());
        }
    }

    public void imprimirRecibo() {
        System.out.println("Pedido " + numero);
        System.out.print("Itens: ");
        for (ItemPedido item : itens) {
            System.out.print(item + ", ");
        }
        System.out.println();

        boolean temPromocao = itens.stream()
                .anyMatch(item -> item.getProduto().getNome().equalsIgnoreCase("Refrigerante") && item.getQuantidade() >= 3);
        if (temPromocao) {
            System.out.println("Promoção aplicada: leve 3, pague 2 (Refrigerante)");
        }

        double total = calcularTotal(cobrarServico);
        System.out.println("Subtotal: " + (cobrarServico ? total / 1.10 : total));
        if (cobrarServico) {
            System.out.println("Taxa de serviço (10%): " + (total - total / 1.10));
        }
        System.out.println("Total a pagar: " + total);
        finalizarPedido();

        for (ItemPedido item : itens) {
            System.out.println("Estoque atualizado: " + item.getProduto().getNome() +
                    " (" + item.getProduto().getEstoque() + " unidades)");
        }
    }
}

