package org.example.AulaJavaBasico;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o numero da tabuada");
        int num = Integer.parseInt(in.nextLine());
        for (int i = 1; i <=10; i++) {
            System.out.println("Tabuada de "+num +" * "+ i + " = " +num*i);
        }
    }
}
