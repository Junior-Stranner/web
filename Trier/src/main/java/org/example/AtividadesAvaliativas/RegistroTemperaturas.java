package org.example.AtividadesAvaliativas;

import java.util.Scanner;

public class RegistroTemperaturas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] temperatura = new double[7];
        double soma = 0;
        int diaMaior = 0, diaMenor = 0;
        for (int i = 0; i < temperatura.length; i++) {
            System.out.print("Temperatura dia " + (i + 1) + ": ");
            temperatura[i] = in.nextDouble();
            soma += temperatura[i];
            if (temperatura[i] > temperatura[diaMaior]) diaMaior = i;
            if (temperatura[i] < temperatura[diaMenor]) diaMenor = i;
        }
        double media = soma / temperatura.length;
        System.out.println("Média: " + media);
        switch (media < 15 ? 1 : media <= 25 ? 2 : 3) {
            case 1: System.out.println("Classificação: Muito Frio");
            case 2: System.out.println("Classificação: Normal");
            case 3: System.out.println("Classificação: Muito Quente");
        }
        System.out.println("Maior: " + temperatura[diaMaior] + " (dia " + (diaMaior + 1) + ")");
        System.out.println("Menor: " + temperatura[diaMenor] + " (dia " + (diaMenor + 1) + ")");
    }
}
