package org.example.AtividadesAvaliativas;

import java.util.Scanner;

public class SistemaFrequenciaEscolar {
    public static void main(String[] args) {
        int alunos = 3;
        int dias = 5;
        int[] presencas = new int[alunos];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < alunos; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            for (int j = 0; j < dias; j++) {
                System.out.print("  Dia " + (j + 1) + " - (P)resente, (F)alta, (A)traso: ");
                char entrada = in.next().toUpperCase().charAt(0);

                switch (entrada) {
                    case 'P':
                    case 'A':
                        presencas[i]++;
                        break;
                    case 'F':
                        break;
                    default:
                        System.out.println("Entrada inválida! Contado como falta.");
                }
            }
        }
        int melhorAluno = 0;
        for (int i = 1; i < alunos; i++) {
            if (presencas[i] > presencas[melhorAluno]) {
                melhorAluno = i;
            }
        }
        System.out.println("\nAluno com maior frequência: Aluno " + (melhorAluno + 1) + " (" + presencas[melhorAluno] + " presenças)");
    }
}
