package org.example.AulaJavaBasico.Exercicios;

public class FLuxoHotelSimples {
    public static void main(String[] args) {
        int[] semana1 = {10, 12, 11, 13, 15, 14, 12};
        int[] semana2 = {11, 13, 12, 14, 16, 15, 13};

        int totalSemana1 = 0;
        int totalSemana2 = 0;

        for (int i = 0; i < 7; i++) {
            totalSemana1 += semana1[i];
            totalSemana2 += semana2[i];
        }

        int totalGeral = totalSemana1 + totalSemana2;
        double mediaSemanal = totalGeral / 2.0;
        double mediaMensal = totalGeral / 4.0;

        System.out.println("Total de pessoas: " + totalGeral);
        System.out.println("Total da semana 1: " + totalSemana1);
        System.out.println("Total da semana 2: " + totalSemana2);
        System.out.println("Média semanal: " + mediaSemanal);
        System.out.println("Média mensal: " + mediaMensal);
    }
}
