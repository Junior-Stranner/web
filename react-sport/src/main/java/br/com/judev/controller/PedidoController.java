package br.com.judev.controller;

import br.com.judev.model.*;
import java.util.ArrayList;
import java.util.List;

public class PedidoController {
    private List<ItemCarrinho> carrinho;
    private List<Pedido> historicoPedidos;
    private ProdutoController produtoController;
    private Cliente clienteAtual;

    public PedidoController(ProdutoController produtoController, Cliente cliente) {
        this.carrinho = new ArrayList<>();
        this.historicoPedidos = new ArrayList<>();
        this.produtoController = produtoController;
        this.clienteAtual = cliente;
    }

    public boolean adicionarItem(Produto produto, int quantidade) {
        if (produto != null && quantidade > 0) {
            if (produto.getEstoque() < quantidade) {
                System.out.println("Erro: Estoque insuficiente para " + produto.getNome() +
                        ". Estoque disponível: " + produto.getEstoque());
                return false;
            }
            //aqui é verificado se o produto está no carrinho
            for (ItemCarrinho item : carrinho) {
                if (item.getProduto().getCodigo().equals(produto.getCodigo())) {
                    int novaQuantidade = item.getQuantidade() + quantidade;
                    if (produto.getEstoque() < novaQuantidade) {
                        System.out.println("Erro: Estoque insuficiente para adicionar mais " + produto.getNome() +
                                ". Estoque disponível: " + (produto.getEstoque() - item.getQuantidade()));
                        return false;
                    }
                    item.setQuantidade(novaQuantidade);
                    return true;
                }
            }
            // Se não encontrou, adiciona novo item
            carrinho.add(new ItemCarrinho(produto, quantidade));
            return true;
        }
        return false;
    }

    public boolean removerItem(String codigoProduto) {
        return carrinho.removeIf(item -> item.getProduto().getCodigo().equals(codigoProduto));
    }

    public List<ItemCarrinho> getItensCarrinho() {
        return new ArrayList<>(carrinho);
    }

    public Pedido finalizarPedido(FormaPagamento formaPagamento) {
        if (carrinho.isEmpty()) {
            return null;
        }
        // Primeiro verifica se todos os itens ainda têm estoque suficiente
        for (ItemCarrinho item : carrinho) {
            Produto produto = item.getProduto();
            if (produto.getEstoque() < item.getQuantidade()) {
                System.out.println("Erro: Estoque insuficiente para " + produto.getNome() +
                        ". Estoque disponível: " + produto.getEstoque() +
                        ", quantidade solicitada: " + item.getQuantidade());
                return null;
            }
        }

        // Atualizando o estoque
        for (ItemCarrinho item : carrinho) {
            produtoController.atualizarEstoque(item.getProduto().getCodigo(), item.getQuantidade());
        }

        double total = calcularTotal();
        Pedido pedido = new Pedido(clienteAtual, new ArrayList<>(carrinho), total, formaPagamento);
        historicoPedidos.add(pedido);
        carrinho.clear();
        return pedido;
    }

    public double calcularTotal() {
        return carrinho.stream()
                .mapToDouble(item -> item.getProduto().getPreco() * item.getQuantidade())
                .sum();
    }

    public List<Pedido> getHistoricoPedidos() {
        return new ArrayList<>(historicoPedidos);
    }
}