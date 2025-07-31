package br.com.judev.model;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Pedido {
    private static final AtomicInteger contadorId = new AtomicInteger(1);
    private final int id;
    private final Cliente cliente;
    private final List<ItemCarrinho> itens;
    private final double total;
    private final FormaPagamento formaPagamento;

    public Pedido(Cliente cliente, List<ItemCarrinho> itens, double total, FormaPagamento formaPagamento) {
        this.id = contadorId.getAndIncrement();
        this.cliente = cliente;
        this.itens = List.copyOf(itens);
        this.total = calcularTotal(itens);
        this.formaPagamento = formaPagamento;
    }

    private double calcularTotal(List<ItemCarrinho> itens) {
        return itens.stream()
                .mapToDouble(item -> item.getProduto().getPreco() * item.getQuantidade())
                .sum();
    }

    // Getters
    public int getId() { return id; }
    public Cliente getCliente() { return cliente; }
    public List<ItemCarrinho> getItens() { return itens; }
    public double getTotal() { return total; }
    public FormaPagamento getFormaPagamento() { return formaPagamento; }
}