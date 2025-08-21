package org.example.AlunoListTrier;

import java.util.Random;
import java.util.Scanner;

public class SistemaPrincipal {
    private static final Scanner in = new Scanner(System.in);
    private static final GerenciadorAlunos gerenciador = new GerenciadorAlunos();
    private static int idCounter = 1;

    public static void main(String[] args) {
        int op;
        do {
            System.out.println("\n=== Sistema de Gerenciamento de Alunos ===");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Listar Alunos");
            System.out.println("3 - Consultar Média e Situação de Aluno");
            System.out.println("4 - Remover Todos os Alunos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            op = in.nextInt();
            in.nextLine();

            switch (op) {
                case 1: cadastrarAluno();break;
                case 2: gerenciador.listarAlunos();break;
                case 3: consultarAluno();break;
                case 4: gerenciador.removerTodosAlunos();break;
                case 0: System.out.println("Encerrando o sistema...");break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (op != 0);
    }

    private static void cadastrarAluno() {
        int id = idCounter++;
        System.out.println("ID do Aluno: " + id);

        System.out.print("Nome do Aluno: ");
        String nome = in.nextLine();

        System.out.print("Nota 1: ");
        double nota1 = in.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = in.nextDouble();

        System.out.print("Nota 3: ");
        double nota3 = in.nextDouble();

        System.out.print("Nota 4: ");
        double nota4 = in.nextDouble();
        in.nextLine();

        Aluno aluno = new Aluno(id, nome, nota1, nota2, nota3, nota4);
        gerenciador.adicionarAluno(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }


    private static void consultarAluno() {
        try {
            System.out.print("Digite o id do aluno para consultar: ");
            int idAluno = Integer.parseInt(in.nextLine());
            Aluno aluno = gerenciador.buscarAlunoPorId(idAluno);

            if (aluno != null) {
                System.out.println("Média: " + aluno.calcularMedia());
                System.out.println("Situação: " + aluno.getSituacao());
            } else {
                System.out.println("Aluno não encontrado.");
            }
        } catch (NumberFormatException e) {
            System.out.println("ID inválido. Digite um número inteiro.");
        }
    }
}
