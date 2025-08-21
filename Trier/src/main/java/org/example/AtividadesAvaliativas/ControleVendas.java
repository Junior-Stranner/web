package org.example.AtividadesAvaliativas;

import java.util.Scanner;

public class ControleVendas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vendas = new double[10];
        double total = 0;
        double media;
        int diaMaiorVenda = 0;
        double maiorVenda = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor da venda do dia " + (i + 1) + ": ");
            vendas[i] = scanner.nextDouble();
            total += vendas[i];

            if (vendas[i] > maiorVenda) {
                maiorVenda = vendas[i];
                diaMaiorVenda = i + 1;
            }
        }
        media = total / 10;

        System.out.println("\nTotal das vendas: R$ " + total);
        System.out.println("Média diária de vendas: R$ " + media);
        System.out.println("Maior venda foi no dia " + diaMaiorVenda + " com R$ " + maiorVenda);
        System.out.println("\nClassificação dos dias em relação à média:");

        for (int i = 0; i < 10; i++) {
            int comparacao = Double.compare(vendas[i], media);

            System.out.print("Dia " + (i + 1) + " - Venda: R$ " + vendas[i] + " => ");

            switch (comparacao) {
                case 1:
                    System.out.println("Acima da média");
                    break;
                case 0:
                    System.out.println("Igual à média");
                    break;
                case -1:
                    System.out.println("Abaixo da média");
                    break;
            }
        }
    }
}
