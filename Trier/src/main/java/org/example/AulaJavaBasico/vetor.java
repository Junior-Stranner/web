package org.example.AulaJavaBasico;

public class vetor {
    public static void main(String[] args) {
        int valor;
        int [] dados  = new int[5];
        dados[2] = 9;
        dados[3] = 7;
        dados[0] = 6;

        System.out.println(dados[3]);

        String nome[]= {"Junior","João","Noah"};
        int i,n = nome.length;

        for ( i = 0; i < n; i++) {
         System.out.println("nome "+(i+1) + nome[i]);
        }

    }
}
