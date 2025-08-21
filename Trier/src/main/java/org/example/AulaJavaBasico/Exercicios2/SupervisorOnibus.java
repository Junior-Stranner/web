package org.example.AulaJavaBasico.Exercicios2;

import java.util.Scanner;

public class SupervisorOnibus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] pessoasPorSemana = new int[4];
        int totalPessoas = 0;

        for (int semana = 0; semana < 4; semana++) {
            System.out.println("Digite o total de pessoas que usaram o ônibus na semana " + (semana + 1) + ":");
            pessoasPorSemana[semana] = in.nextInt();

            totalPessoas += pessoasPorSemana[semana];
        }
        for (int semana = 0; semana < 4; semana++) {
            System.out.println("Semana " + (semana + 1) + " :" + pessoasPorSemana[semana] + " pessoas");
        }

        double mediaSemanal = totalPessoas / 4.0;
        System.out.println("Total geral de pessoas: " + totalPessoas);
        System.out.println("Média semanal: " + String.format("%.2f", mediaSemanal) + " pessoas");

        if (mediaSemanal > 60) {
            System.out.println("São necessários 4 micro-ônibus.");
        } else if (mediaSemanal > 30) {
            System.out.println("São necessários 2 micro-ônibus.");
        } else {
            System.out.println("1 micro-ônibus é suficiente.");
        }
    }
}
