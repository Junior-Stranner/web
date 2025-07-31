package br.com.judev.view;

import br.com.judev.controller.PedidoController;
import br.com.judev.controller.ProdutoController;
import br.com.judev.model.*;
import java.util.List;
import java.util.Scanner;

public class MenuPedidoView {
    private static final Scanner in = new Scanner(System.in);
    private static PedidoController pedidoController;
    private static ProdutoController produtoController;

    public MenuPedidoView(PedidoController pedidoController, ProdutoController produtoController) {
        MenuPedidoView.pedidoController = pedidoController;
        MenuPedidoView.produtoController = produtoController;
    }

    public static void exibirMenuPedido() {
        int opcao;
        do {
            System.out.println("\n=== Carrinho de Compras ===");
            System.out.println("1 - Ver carrinho");
            System.out.println("2 - Adicionar produto");
            System.out.println("3 - Remover produto");
            System.out.println("4 - Finalizar compra");
            System.out.println("5 - Ver histórico de pedidos");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e) {
                opcao = -1;
            }

            switch (opcao) {
                case 1:
                    exibirCarrinho();
                    break;
                case 2:
                    adicionarProdutoAoCarrinho();
                    break;
                case 3:
                    removerProdutoDoCarrinho();
                    break;
                case 4:
                    finalizarCompra();
                    break;
                case 5:
                    exibirHistoricoPedidos();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void exibirCarrinho() {
        List<ItemCarrinho> itensCarrinho = pedidoController.getItensCarrinho();
        double total = pedidoController.calcularTotal();

        System.out.println("\n=== Seu Carrinho ===");
        if (itensCarrinho.isEmpty()) {
            System.out.println("Carrinho vazio.");
            return;
        }

        for (ItemCarrinho item : itensCarrinho) {
            Produto p = item.getProduto();
            System.out.printf("- %s | %d x R$ %.2f = R$ %.2f%n",
                    p.getNome(),
                    item.getQuantidade(),
                    p.getPreco(),
                    (p.getPreco() * item.getQuantidade()));
        }
        System.out.println("-------------------");
        System.out.printf("Total: R$ %.2f%n", total);
    }

    private static void adicionarProdutoAoCarrinho() {
        System.out.println("\n=== Adicionar Produto ===");
        System.out.print("Digite o código do produto: ");
        String codigo = in.nextLine();

        Produto produto = produtoController.buscarPorCodigo(codigo);
        if (produto == null) {
            System.out.println("Produto não encontrado.");
            return;
        }

        System.out.print("Digite a quantidade: ");
        int quantidade;
        try {
            quantidade = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Quantidade inválida.");
            return;
        }

        if (pedidoController.adicionarItem(produto, quantidade)) {
            System.out.printf("%d x %s adicionado(s) ao carrinho.%n", quantidade, produto.getNome());
        } else {
            System.out.println("Não foi possível adicionar o produto ao carrinho.");
        }
    }

    private static void removerProdutoDoCarrinho() {
        System.out.println("\n=== Remover Produto ===");
        exibirCarrinho();

        if (pedidoController.getItensCarrinho().isEmpty()) {
            return;
        }

        System.out.print("Digite o código do produto a ser removido: ");
        String codigo = in.nextLine();

        if (pedidoController.removerItem(codigo)) {
            System.out.println("Produto removido do carrinho.");
        } else {
            System.out.println("Produto não encontrado no carrinho.");
        }
    }

    private static void finalizarCompra() {
        System.out.println("\n=== Finalizar Compra ===");
        exibirCarrinho();

        if (pedidoController.getItensCarrinho().isEmpty()) {
            System.out.println("Carrinho vazio. Adicione produtos antes de finalizar.");
            return;
        }

        System.out.println("\nSelecione a forma de pagamento:");
        System.out.println("1 - " + FormaPagamento.CARTAO_CREDITO);
        System.out.println("2 - " + FormaPagamento.PIX);
        System.out.println("3 - " + FormaPagamento.BOLETO);
        System.out.print("Opção: ");

        int opcaoPagamento;
        try {
            opcaoPagamento = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException e) {
            opcaoPagamento = -1;
        }

        FormaPagamento formaPagamento;
        switch (opcaoPagamento) {
            case 1:
                formaPagamento = FormaPagamento.CARTAO_CREDITO;
                break;
            case 2:
                formaPagamento = FormaPagamento.PIX;
                break;
            case 3:
                formaPagamento = FormaPagamento.BOLETO;
                break;
            default:
                System.out.println("Opção de pagamento inválida.");
                return;
        }

        Pedido pedido = pedidoController.finalizarPedido(formaPagamento);
        if (pedido != null) {
            System.out.println("\n=== Compra Finalizada ===");
            System.out.println("Cliente: " + pedido.getCliente().getNome());
            System.out.println("Forma de Pagamento: " + pedido.getFormaPagamento());
            System.out.printf("Total: R$ %.2f%n", pedido.getTotal());
            System.out.println("\nObrigado por comprar conosco!");
        } else {
            System.out.println("Erro ao finalizar o pedido.");
        }
    }

    private static void exibirHistoricoPedidos() {
        List<Pedido> historico = pedidoController.getHistoricoPedidos();

        System.out.println("\n=== Histórico de Pedidos ===");
        if (historico.isEmpty()) {
            System.out.println("Nenhum pedido realizado ainda.");
            return;
        }

        for (Pedido pedido : historico) {
            System.out.println("\nCliente: " + pedido.getCliente().getNome());
            System.out.println("Forma de Pagamento: " + pedido.getFormaPagamento());
            System.out.printf("Total: R$ %.2f%n", pedido.getTotal());
            System.out.println("Itens:");
            for (ItemCarrinho item : pedido.getItens()) {
                Produto p = item.getProduto();
                System.out.printf("- %s | %d x R$ %.2f%n",
                        p.getNome(),
                        item.getQuantidade(),
                        p.getPreco());
            }
        }
    }
}