package org.example.AulaJavaBasico;

import java.util.Scanner;

public class contagemRegresiva {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in) ;

       System.out.println("Digite um numero para a contagem regresiva");
       int numContagem = Integer.parseInt(in.nextLine());
        for (int i = 0; i < numContagem; numContagem--) {
            System.out.println("COntagem: "+numContagem);
            if(numContagem == 1){
                System.out.println("Vai");
            }
        }
        in.close();
    }
}
