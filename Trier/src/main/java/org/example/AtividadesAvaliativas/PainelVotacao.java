package org.example.AtividadesAvaliativas;

import java.util.Scanner;

public class PainelVotacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] produtos = {"Sistema web","Sistema Mobile", "Sistema Desktop"};
        int[] votos = new int[5];
        int opcao;
        do {
            System.out.println("\n=== Painel de Votação ===");
            for (int i = 0; i < produtos.length; i++) {
                System.out.println((i + 1) + " - " + produtos[i]);
            }
            System.out.println("0 - Encerrar votação");
            System.out.print("Escolha sua opção: ");
            opcao = in.nextInt();

            switch (opcao) {
                case 1,2,3-> {
                    votos[opcao - 1]++;
                    System.out.println("Voto registrado com sucesso!");
                }
                case 0 -> System.out.println("Votação encerrada!");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        System.out.println("\n=== Resultado da Votação ===");
        for (int i = 0; i < produtos.length; i++) {
            System.out.print(produtos[i] + ": ");
            for (int j = 0; j < votos[i]; j++) {
                System.out.print("*");
            }
            System.out.println(" (" + votos[i] + " votos)");
        }
    }
}
