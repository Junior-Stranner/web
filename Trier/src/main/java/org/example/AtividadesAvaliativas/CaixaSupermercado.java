package org.example.AtividadesAvaliativas;

import java.util.Scanner;

public class CaixaSupermercado {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double valores = 0;
        double[] compras = new double[15];
        int soma = 0;

        for (int i = 0; i < compras.length; i++) {
            System.out.println("Digite o valor da "+(i+1)+" compra");
            valores = Float.parseFloat(in.nextLine());
            soma += valores;
        }
         int totalCompra = soma;
        switch(totalCompra >= 200 ? 1 : totalCompra >= 100 ? 2 : 3){
            case 1:System.out.println("Total da compra : "+ totalCompra * 0.90+ " com o desconto de 10%");break;
            case 2:System.out.println("Total da compra : "+ totalCompra * 0.95+ " com o desconto de 5%");break;
            case 3:System.out.println("Total da compra : "+ totalCompra+ " sem desconto!");break;
        }
    }
}
