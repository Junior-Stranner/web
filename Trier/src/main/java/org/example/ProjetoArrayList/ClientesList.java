package org.example.ProjetoArrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ClientesList {
   private static final Scanner in = new Scanner(System.in);
   private static final ArrayList<Cliente> clientes = new ArrayList<>();

    public static void main(String[] args) {

        int op = 0;
        do{
            System.out.println("\n=== Sistema de Gerenciamento de Produtos ===");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Consultar Cliente");
            System.out.println("3 - Remover CLient pelo Código");
            System.out.println("4 - Remover todos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            op = in.nextInt();

            switch(op){

                case 1: cadastrarCliente();break;
                case 2: consultarClientes();break;
                case 3: removerClientePorCodigo();break;
                case 4: RemoverTodos();break;
                case 0:System.out.println("Encerrando o sistema...");break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }while(op != 0);
    }

    private static void RemoverTodos() {
        clientes.clear();
        System.out.println("Todos os clientes foram removidos.");
    }

    private static void removerClientePorCodigo() {
        System.out.println("Digite o código do cliente que deseja remover:");
        int idCliente = in.nextInt();
        in.nextLine();

        boolean encontrado = false;
        for (Cliente c : clientes) {
            if (c.getId() == idCliente) {
                clientes.remove(c);
                System.out.println("Cliente removido com sucesso!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Cliente não encontrado.");
        }
    }

    private static void consultarClientes() {
        for (Cliente c: clientes) {
         System.out.println(c.toString());
        }
    }

    private static void cadastrarCliente() {
        Random randomId = new Random();
        int id = randomId.nextInt(10000);

        System.out.println("ID do Cliente: " + id);

        System.out.println("Digite o nome do Cliente: ");
        String nome = in.nextLine();

        System.out.println("Digite a idade do Cliente: ");
        int idade = Integer.parseInt(in.nextLine());

        System.out.println("Seu time de coração: ");
        String time = in.nextLine();

        Cliente c = new Cliente(id, nome, idade, time);
        clientes.add(c);
        System.out.println("Cliente cadastrado com sucesso!");
    }
}

