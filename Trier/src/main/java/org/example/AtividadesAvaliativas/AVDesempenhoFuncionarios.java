package org.example.AtividadesAvaliativas;

import java.util.Scanner;

public class AVDesempenhoFuncionarios {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float[] notas = new float[6];
        int ruim = 0, medio = 0, bom = 0;

        System.out.println("Digite as notas dos 6 funcionários (0 a 10):");

        for (int i = 0; i < 6; i++) {
            System.out.print("Nota do funcionário " + (i + 1) + ": ");
            float nota = Float.parseFloat(in.nextLine());

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Digite novamente.");
                i--;
                continue;
            }
            notas[i] = nota;

            switch ((int) nota) {
                case 0: case 1: case 2: case 3: case 4:
                    ruim++;
                    break;
                case 5: case 6: case 7:
                    medio++;
                    break;
                case 8: case 9: case 10:
                    bom++;
                    break;
            }
        }
        System.out.println("\nResultado da avaliação:");
        System.out.println("Ruim: " + ruim + " funcionários");
        System.out.println("Médio: " + medio + " funcionários");
        System.out.println("Bom: " + bom + " funcionários");
    }
}
