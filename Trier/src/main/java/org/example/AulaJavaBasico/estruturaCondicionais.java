package org.example.AulaJavaBasico;

import java.util.Scanner;

public class estruturaCondicionais {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
/*
    int x = 13;

        if (x > 0 && x < 12) {
        System.out.println("Bom dia!\n");
    } else if (x >= 13 && x <= 18) {
        System.out.println("Boa tarde!\n");
    } else if (x >= 18 && x <= 24) {
        System.out.println("Boa Noite !\n");
    }else{
        System.out.println("Erro !\n");
     }*/

        System.out.println("Escreva um número");
        int numero = Integer.parseInt(in.nextLine());
        if(numero < 0){
            System.out.println("Número negatuvo!");
        }else if(numero>=0){
            System.out.println("Positivo!");
        }else{
            System.out.println("Erro!");
        }
   }
}
