package org.example.AtividadesAvaliativas;

import java.util.Scanner;

public class CadastroProdutos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] produtos = new int[10];


        System.out.println("Cadastro de 10 produtos:");
        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Digite o código do " + (i + 1) + "º produto: ");
            produtos[i] = Integer.parseInt(in.nextLine());
        }
        int opcao;
        do {
            System.out.println("\n--- Menu de Consulta ---");
            System.out.println("1 - Consultar código");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(in.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Digite o código para consultar: ");
                    int codigoConsulta = Integer.parseInt(in.nextLine());
                    boolean encontrado = false;
                    for (int cod : produtos) {
                        if (cod == codigoConsulta) {
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado) {
                        System.out.println("Código encontrado no cadastro!");
                    } else {
                        System.out.println("Código NÃO encontrado.");
                    }break;
                case 0:
                    System.out.println("Consulta encerrada. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }
}
