package org.example.AulaJavaBasico;

public class ExemploVetor3 {
    public static void main(String[] args) {

        String mes[] = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho",
                "Agosto","Setembro","Outubro","Novembro","Dzembro"};

        int diasMes [] = {31,28,31,30,31,30,31,31,30,31,30,31};

        for (int i = 0; i < diasMes.length; i++) {
            System.out.printf("%s, tem %d dias. \n",mes[i], diasMes[i]);

        }
    }
}
