package org.example.AulaJavaBasico.Exercicios;

import java.util.Random;
import java.util.Scanner;

public class logicaLacoRepeticao {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int meuNumAleatorio = 0;
        Random gerador = new Random();
        int numeroALeatorio = gerador.nextInt(101);

        do {
            System.out.println(numeroALeatorio);
            System.out.println("Digite um Número Aleatótio que vai de 0 a 100");
            meuNumAleatorio = Integer.parseInt(in.nextLine());
            if (numeroALeatorio > meuNumAleatorio) {
                    System.out.println("Digite um número maior");
                }else{
                    System.out.println("Digite um número menor");
                }
        } while (numeroALeatorio != meuNumAleatorio);
        System.out.println("Você acertou! \n o número gerado foi: "+numeroALeatorio);
    }
}
