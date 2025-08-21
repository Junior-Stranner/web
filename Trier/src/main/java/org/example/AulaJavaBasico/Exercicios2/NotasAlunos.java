package org.example.AulaJavaBasico.Exercicios2;

import java.util.Scanner;

public class NotasAlunos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int qtdAlunos = in.nextInt();

        double[][] notas = new double[qtdAlunos][4];
        double somaTurma = 0;
        int aprovados = 0, recuperacao = 0, reprovados = 0;

        for (int aluno = 0; aluno < qtdAlunos; aluno++) {
            double somaNotas = 0;
            System.out.println("Aluno " +(aluno + 1));

            for (int prova = 0; prova < 4; prova++) {
                System.out.println(" Nota da avaliação  " +(prova + 1));
                notas[aluno][prova] = in.nextDouble();
                somaNotas += notas[aluno][prova];
            }

            double media = somaNotas / 4;
            somaTurma += media;

            if (media >= 7) {
                System.out.println("  Média:  Aprovado "+media);
                aprovados++;
            } else if (media >= 5) {
                System.out.printf("  Média: recuperação" +media);
                recuperacao++;
            } else {
                System.out.printf("  Média: Reprovado "+media);
                reprovados++;
            }
        }
        double mediaTurma = somaTurma / qtdAlunos;
        System.out.println("Total de aprovados: " + aprovados);
        System.out.println("Total em recuperação: " + recuperacao);
        System.out.println("Total de reprovados: " + reprovados);
        System.out.printf("Média geral da turma: %.2f%n", mediaTurma);
    }
}
