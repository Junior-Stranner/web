package org.example.AulaJavaBasico.Exercicios;

import java.util.Scanner;

public class VendasSemanais2 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[][] vendas = new double[5][5];
        double totalGeral = 0;
        double maiorSemana = 0;
        int semanaMaiorFaturamento = 0;

        for (int semana = 0; semana < 5; semana++) {
            System.out.printf("Semana %d:%n", semana + 1);
            for (int dia = 0; dia < 5; dia++) {
                System.out.printf("  Digite o valor de vendas do dia %d: R$ ", dia + 1);
                vendas[semana][dia] = in.nextDouble();
            }
        }

        System.out.println();

        for (int semana = 0; semana < 5; semana++) {
            double totalSemana = 0;
            for (int dia = 0; dia < 5; dia++) {
                totalSemana += vendas[semana][dia];
            }
            System.out.printf("Total da semana %d: R$ %.2f%n", semana + 1, totalSemana);
            totalGeral += totalSemana;

            if (totalSemana > maiorSemana) {
                maiorSemana = totalSemana;
                semanaMaiorFaturamento = semana + 1;
            }
        }
        double mediaDiaria = totalGeral / 25; // 5 semanas * 5 dias

        System.out.printf("%nFaturamento total no período: R$ %.2f%n", totalGeral);
        System.out.printf("Média diária de vendas: R$ %.2f%n", mediaDiaria);
        System.out.printf("Semana com maior faturamento: Semana %d (R$ %.2f)%n", semanaMaiorFaturamento, maiorSemana);

        if (mediaDiaria > 500) {
            System.out.println("Excelente desempenho!");
        } else {
            System.out.println("Avaliar estratégias de venda.");
        }
    }
}
