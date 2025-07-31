package br.com.judev.view;

import br.com.judev.controller.PedidoController;
import br.com.judev.controller.ProdutoController;
import br.com.judev.model.Produto;

import java.util.List;
import java.util.Scanner;

public class MenuProdutoView {
    private static final Scanner in = new Scanner(System.in);
    private static ProdutoController produtoController;

    public MenuProdutoView(ProdutoController produtoController) {
        this.produtoController = produtoController;
    }

    public static void exibirMenuProduto() {
        int opcao;
        do {
            System.out.println("\n=== Menu de Produtos ===");
            System.out.println("1 - Ver produtos por categoria");
            System.out.println("2 - Buscar produto por nome");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e) {
                opcao = -1;
            }

            switch (opcao) {
                case 1:
                    exibirProdutosPorCategoria();
                    break;
                case 2:
                    buscarProdutoPorNome();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void exibirProdutosPorCategoria() {
        System.out.println("\nCategorias disponíveis:");
        System.out.println("1 - Premier League");
        System.out.println("2 - La Liga");
        System.out.println("3 - Seleções");
        System.out.println("4 - Voltar");
        System.out.print("Escolha uma categoria: ");

        int opcaoCategoria;
        try {
            opcaoCategoria = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException e) {
            opcaoCategoria = -1;
        }

        String categoria;
        switch (opcaoCategoria) {
            case 1:
                categoria = "Premier League";
                break;
            case 2:
                categoria = "La Liga";
                break;
            case 3:
                categoria = "Seleções";
                break;
            case 4:
                return;
            default:
                System.out.println("Categoria inválida.");
                return;
        }

        List<Produto> produtos = produtoController.filtrarPorCategoria(categoria);
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto encontrado nesta categoria.");
            return;
        }

        System.out.println("\nProdutos da categoria " + categoria + ":");
        for (Produto produto : produtos) {
            System.out.println("[" + produto.getCodigo() + "] " + produto.getNome() + " - R$ " + produto.getPreco());
        }

        System.out.print("\nDigite o código do produto para adicionar ao carrinho (ou 0 para cancelar): ");
        String codigo = in.nextLine();

        if (codigo.equals("0")) {
            return;
        }

        Produto selecionado = produtoController.buscarPorCodigo(codigo);
        if (selecionado == null || !selecionado.getCategoria().equalsIgnoreCase(categoria)) {
            System.out.println("Código inválido ou produto não pertence à categoria selecionada.");
            return;
        }

        System.out.println("Produto selecionado: " + selecionado.getNome() + " - R$ " + selecionado.getPreco());
        System.out.print("Deseja adicionar ao carrinho? (s/n): ");
        String confirmacao = in.nextLine();

        if (confirmacao.equalsIgnoreCase("s")) {
            System.out.println("Produto adicionado ao carrinho com sucesso!");
        } else {
            System.out.println("Operação cancelada.");
        }
    }

    private static void buscarProdutoPorNome() {
        System.out.print("Digite o nome do produto que deseja buscar: ");
        String nome = in.nextLine();

        List<Produto> produtosEncontrados = produtoController.buscarPorNome(nome);

        if (produtosEncontrados.isEmpty()) {
            System.out.println("Nenhum produto encontrado com esse nome.");
            return;
        }

        System.out.println("\nProdutos encontrados:");
        for (Produto produto : produtosEncontrados) {
            System.out.println("- " + produto.getNome() + " | Preço: R$ " + produto.getPreco() +
                    " | Código: " + produto.getCodigo());
        }
    }
}