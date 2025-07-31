package br.com.judev.teste;

import br.com.judev.controller.ClienteController;
import br.com.judev.controller.ProdutoController;
import br.com.judev.view.MenuPrincipalView;

public class TesteSistemaPrincipal {
    public static void main(String[] args) {
        ProdutoController produtoController = new ProdutoController();
        ClienteController clienteController = new ClienteController();

        MenuPrincipalView menuPrincipal = new MenuPrincipalView(produtoController, clienteController);
        menuPrincipal.exibirMenuCliente();

    }
}
