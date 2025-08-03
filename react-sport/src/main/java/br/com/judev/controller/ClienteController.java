package br.com.judev.controller;

import br.com.judev.model.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ClienteController {

    private static final Logger logger = Logger.getLogger(ClienteController.class.getName());
    private final List<Cliente> clientes = new ArrayList<>();
    private Cliente clienteLogado;

    public Cliente getClienteLogado() {
        return clienteLogado;
    }

    public void cadastrarCliente(Cliente cliente){
        if(buscarPorEmail(cliente.getEmail()) != null){
            logger.warning("Tentativa de cadastro com email já existente: " + cliente.getEmail());
            return;
        }
        this.clientes.add(cliente);
        logger.info("Cliente cadastrado com sucesso: " + cliente.getEmail());

    }
    public boolean login(String email, String senha) {
        Cliente cliente = buscarPorEmail(email);
        if (cliente != null && cliente.getSenha().equals(senha)) {
            this.clienteLogado = cliente;
            return true;
        }
        return false;
    }

    private Cliente buscarPorEmail(String email) {
        for (Cliente cliente : clientes) {
            if (cliente.getEmail().equalsIgnoreCase(email)){
                return cliente;
            }
        }
        return null;
    }
}
