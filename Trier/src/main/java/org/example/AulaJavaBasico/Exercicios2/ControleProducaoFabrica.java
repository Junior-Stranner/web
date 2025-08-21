package org.example.AulaJavaBasico.Exercicios2;

import java.util.Scanner;

public class ControleProducaoFabrica {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] producaoDiaria = new int[14];

        for (int i = 0; i < producaoDiaria.length; i++) {
            System.out.println("Informe a quantidade de peças produzidas no dia " + (i + 1) + ": ");
            producaoDiaria[i] = in.nextInt();
        }

        int totalSemana1 = 0;
        int totalSemana2 = 0;
        int totalGeral = 0;

        for (int i = 0; i < 7; i++) {
            totalSemana1 += producaoDiaria[i];
        }
        for (int i = 7; i < 14; i++) {
            totalSemana2 += producaoDiaria[i];
        }

        totalGeral = totalSemana1 + totalSemana2;
        double mediaDiaria = totalGeral / producaoDiaria.length;

        System.out.println("Total da semana 1: " + totalSemana1 + " peças");
        System.out.println("Total da semana 2: " + totalSemana2 + " peças");
        System.out.println("Total geral: " + totalGeral + " peças");
        System.out.println("Média diária: " + String.format("%.2f", mediaDiaria) + " peças");

        if (mediaDiaria > 80) {
            System.out.println("Meta batida!");
        } else if (mediaDiaria >= 50) {
            System.out.println("Meta quase atingida.");
        } else {
            System.out.println("Produção abaixo do esperado.");
        }
    }
}
