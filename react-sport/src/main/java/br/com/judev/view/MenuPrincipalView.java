package br.com.judev.view;

import br.com.judev.controller.ClienteController;
import br.com.judev.controller.PedidoController;
import br.com.judev.controller.ProdutoController;
import br.com.judev.model.Cliente;

import java.util.Scanner;

public class MenuPrincipalView {
    private static final Scanner in = new Scanner(System.in);
    private static ProdutoController produtoController;
    private static ClienteController clienteController;
    private static PedidoController pedidoController;

    public MenuPrincipalView(ProdutoController produtoController, ClienteController clienteController , PedidoController pedidoController) {
        this.produtoController = produtoController;
        this.clienteController = clienteController;
        this.pedidoController = pedidoController;
    }

    public void exibirMenuCliente() {
        produtoController.carregarProdutos();
        int opPrincipal;
        do {
            System.out.println("\n==== React Sport ====\n");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Login");
            System.out.println("0 - Sair\n");
            System.out.print("Escolha: ");

            try {
                opPrincipal = Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e) {
                opPrincipal = -1;
            }

            switch (opPrincipal) {
                case 1 -> cadastrarCliente();
                case 2 -> fazerLogin();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opPrincipal != 0);
    }

    private static void cadastrarCliente() {
        System.out.println("\n--- Cadastro de Cliente ---");
        System.out.print("Nome: ");
        String nome = in.nextLine();
        System.out.print("Email: ");
        String email = in.nextLine();
        System.out.print("Senha: ");
        String senha = in.nextLine();
        System.out.print("CPF: ");
        String cpf = in.nextLine();
        System.out.print("Telefone: ");
        String telefone = in.nextLine();
        System.out.print("Endereço: ");
        String endereco = in.nextLine();

        Cliente novoCliente = new Cliente(nome, email, senha, cpf, telefone, endereco);
        clienteController.cadastrarCliente(novoCliente);
    }

    private static  void fazerLogin() {
        System.out.println("\n--- Login ---");
        System.out.print("Email: ");
        String email = in.nextLine();
        System.out.print("Senha: ");
        String senha = in.nextLine();

        boolean logado = clienteController.login(email, senha);

        if (logado) {
            System.out.println("Login realizado com sucesso!");

            MenuPedidoView menuPedidoView = new MenuPedidoView(produtoController, pedidoController);
            menuPedidoView.exibirMenuProduto();
        } else {
            System.out.println("Email ou senha incorretos.");
        }
    }
}
