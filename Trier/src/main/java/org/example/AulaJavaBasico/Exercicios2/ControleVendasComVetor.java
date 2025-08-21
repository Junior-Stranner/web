package org.example.AulaJavaBasico.Exercicios2;

import java.util.Scanner;

public class ControleVendasComVetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] vendas = new double[25];
        double totalGeral = 0;
        double maiorFaturamento = 0;
        int semanaMaiorFaturamento = 0;

        for (int i = 0; i < vendas.length; i++) {
            System.out.printf("Digite o valor da venda do dia %d: R$ ", i + 1);
            vendas[i] = in.nextDouble();
        }

        for (int semana = 0; semana < 5; semana++) {
            double totalSemana = 0;

            for (int dia = 0; dia < 5; dia++) {
                totalSemana += vendas[semana * 5 + dia];
            }

            System.out.printf("Total da semana %d: R$ %.2f%n", semana + 1, totalSemana);
            totalGeral += totalSemana;

            if (totalSemana > maiorFaturamento) {
                maiorFaturamento = totalSemana;
                semanaMaiorFaturamento = semana + 1;
            }
        }

        double mediaDiaria = totalGeral / vendas.length;

        System.out.printf("%nFaturamento total: R$ %.2f%n", totalGeral);
        System.out.printf("Média diária: R$ %.2f%n", mediaDiaria);
        System.out.printf("Semana com maior faturamento: Semana %d (R$ %.2f)%n", semanaMaiorFaturamento, maiorFaturamento);

        if (mediaDiaria > 500) {
            System.out.println("Excelente desempenho!");
        } else {
            System.out.println("Avaliar estratégias de venda.");
        }
    }
}
