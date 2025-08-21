package org.example.AulaJavaBasico.Exercicios;

import java.util.Scanner;

public class GerenteHotel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] semana1 = new int[7];
        int[] semana2 = new int[7];

        System.out.println("Digite o número de pessoas para cada dia da Primeira semana:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            semana1[i] = Integer.parseInt(in.nextLine());
        }

        System.out.println("\nDigite o número de pessoas para cada dia da Segunda semana:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            semana2[i] = Integer.parseInt(in.nextLine());
        }

        int totalSemana1 = soma(semana1);
        int totalSemana2 = soma(semana2);
        int totalGeral = totalSemana1 + totalSemana2;

        double mediaSemanal = totalGeral / 2.0;
        double mediaMensal = totalGeral / 4.0;

        System.out.println("\nResultados:");
        System.out.println("a. Número total de pessoas: " + totalGeral);
        System.out.println("b. Total da Primeira semana: " + totalSemana1);
        System.out.println("c. Total da Segunda semana: " + totalSemana2);
        System.out.println("d. Média de pessoas por semana: " + mediaSemanal);
        System.out.println("e. Média de pessoas por mês: " + mediaMensal);

        in.close();
    }

    public static int soma(int[] semana) {
        int soma = 0;
        for (int valor : semana) {
            soma += valor;
        }
        return soma;
    }
}
