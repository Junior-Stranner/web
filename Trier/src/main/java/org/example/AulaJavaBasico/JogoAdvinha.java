package org.example.AulaJavaBasico;

import java.util.Random;
import java.util.Scanner;

public class JogoAdvinha {
    public static void main(String[] args) {

        Random gerador = new Random();
        int numeroALeatorio = gerador.nextInt(100);

        Scanner in = new Scanner(System.in);
        System.out.println("Advinha o número que estou pensando");
        int numero = Integer.parseInt(in.nextLine());

        if(numero == numeroALeatorio){
            System.out.println("Parabens! vc acertou, eu estava pensando " +numeroALeatorio);
        }else{
            System.out.println("Vc errou, eu pensei no "+numeroALeatorio);
        }
    }
}
