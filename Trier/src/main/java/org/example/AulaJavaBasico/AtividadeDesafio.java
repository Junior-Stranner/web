package org.example.AulaJavaBasico;

import java.util.Scanner;

public class AtividadeDesafio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Qual o salário de Jéssica? R$ ");
        String salarioInput = in.nextLine();
        try {
            double salario = Double.parseDouble(salarioInput);
            if (salario < 5000) {
                System.out.println("Empréstimo Negado: o salário é menor que o esperado.");
            } else {
                System.out.print("Anos trabalhados na empresa: ");
                int anosTrabalhados = Integer.parseInt(in.nextLine());

                System.out.print("Possui dívidas recentes? (sim/não): ");
                String divida = in.nextLine().trim().toLowerCase();

                if (anosTrabalhados >= 4 && divida.equals("não")) {
                    System.out.println("Empréstimo Aprovado!");
                } else {
                    System.out.println("Empréstimo em análise.");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida: você inseriu um valor não numérico.");
        }
    }
}
