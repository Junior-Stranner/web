package org.example.AtividadesAvaliativas;

import java.util.Scanner;

public class ControleEstoque {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] produtos = {"Laranja","Banana","Maçã","Manga","Abacaixi"};
        int[] qtdProdutos = new int[produtos.length];
        int opcao;
        do {
            System.out.println("\n=== Controle de Estoque ===");
            System.out.println("1 - Entrada de produto");
            System.out.println("2 - Saída de produto");
            System.out.println("3 - Relatório de Estoque");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = in.nextInt();
            switch(opcao){

                case 1: System.out.println("Qual o produto que vc deseja dar entrada? ");
                    for (int i = 0; i < produtos.length; i++) {
                        System.out.println((i + 1) + " - " +produtos[i]);
                     }
                        System.out.print("Opção: ");
                        int entrada = in.nextInt();
                        if(entrada >= 1 && entrada <= produtos.length){
                            System.out.println("Adicionar Quantidade");
                            int qtd = in.nextInt();
                            qtdProdutos[entrada - 1] += qtd;
                            System.out.println("Entrada realizada com sucesso!");
                        }else{
                            System.out.println("Opção Inválida!");
                        }
                        break;
                case 2:
                    System.out.println("Selecione o Produto que vc queira dar Baixa");
                    for (int i = 0; i < produtos.length; i++) {
                        System.out.println((i + 1) + " - " +produtos[i]);
                    }
                    System.out.print("Opção: ");
                    int saida = in.nextInt();
                    if(saida >= 1 && saida <= produtos.length){
                        System.out.println("Retirar Quantidade");
                        int qtd = in.nextInt();
                        qtdProdutos[saida - 1] -= qtd;
                        System.out.println("Saida realizada com sucesso!");
                    }else{
                        System.out.println("Opção Inválida!");
                    }break;

                case 3:  System.out.println("\n=== Relatório de Estoque ===");
                    for (int i = 0; i < produtos.length; i++) {
                        System.out.println(produtos[i] + ": " + qtdProdutos[i] + " unidades");
                    }
                    break;
                case 0:System.out.println("Encerrando o sistema...");break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }while(opcao != 0);
    }
}
