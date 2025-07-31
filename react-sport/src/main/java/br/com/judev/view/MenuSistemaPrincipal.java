/*package br.com.judev.view;

import br.com.judev.controller.ClienteController;
import br.com.judev.controller.ProdutoController;
import br.com.judev.view.MenuClienteView;
import br.com.judev.view.MenuPedidoView;
import br.com.judev.view.MenuPrincipalView;

import java.util.Scanner;

public class MenuSistemaPrincipal {
    private static final Scanner in = new Scanner(System.in);
    public  static final ClienteController clienteController = new ClienteController();
    public static final ProdutoController produtoController = new ProdutoController();

    public void exibirMenuPrincipal() {
        int op;
        do {
            System.out.println("\n==== Loja Futebol FC ====\n");
            System.out.println("1 - Gerenciar Clientes");
            System.out.println("2 - Gerenciar Produtos");
            System.out.println("3 - Gerenciar Pedidos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                op = Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e) {
                op = -1;
            }

            switch (op) {
                case 1:
                    new MenuClienteView(clienteController).exibirMenuCliente();
                    break;
                case 2:
                    new MenuPrincipalView(produtoController).exibirMenuProduto();
                    break;
                case 3:
                    new MenuPedidoView().exibirMenuPedido(); // Se você tiver pedidos
                    break;
                case 0:
                    System.out.println("Encerrando aplicação...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (op != 0);
    }

}
*/