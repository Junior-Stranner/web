package org.example.AtividadesAvaliativas;

import java.util.Scanner;

public class AnaliseNotasFinais {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int alunos = 10;
        double[] notas = new double[alunos];
        double soma = 0;

        for (int i = 0; i < alunos; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + "(1 a 10) : ");
            notas[i] = Double.parseDouble(in.nextLine());

            while (notas[i] < 0 || notas[i] > 10) {
                System.out.print("Nota inválida! Digite novamente a nota do aluno " + (i + 1) + ": ");
                notas[i] = Double.parseDouble(in.nextLine());
            }
            soma += notas[i];
        }
        double media = soma / alunos;
        System.out.println("Média da turma: "+media);

        char conceito;
        if (media >= 9) {
            conceito = 'A';
        } else if (media >= 7) {
            conceito = 'B';
        } else if (media >= 5) {
            conceito = 'C';
        } else if (media >= 3) {
            conceito = 'D';
        } else {
            conceito = 'F';
        }

        switch (conceito) {
            case 'A': System.out.println("Turma muito estudiosa, parabéns!");break;
            case 'B': System.out.println("Turma estudiosa, parabéns!");break;
            case 'C': System.out.println("Turma está na média.");break;
            case 'D': System.out.println("Turma não está na média, tem que estudar.");break;
            case 'F': System.out.println("Turma muito abaixo da média, atenção!");break;
        }
        int acimaDaMedia = 0;
        for (double nota : notas) {
            if (nota > media) {
                acimaDaMedia++;
            }
        }
        System.out.println("Número de alunos acima da média: " + acimaDaMedia);
    }
}
