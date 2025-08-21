package org.example.CarroPOO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Carro> carros = new ArrayList<>();
        int op;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Adicionar carro");
            System.out.println("2. Verificar estado do carro");
            System.out.println("3. Ligar o carro");
            System.out.println("4. Desligar o carro");
            System.out.println("5. Remover carro");
            System.out.println("6. Listar todos os carros");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    Carro carro = new Carro();
                    carro.modelo = "Civic";
                    carro.km = "50000";
                    carro.cor = "Preto";
                    carro.marca = "Honda";
                    carro.situacao = "bom";
                    carro.observacao = "Sem observações";
                    carro.placa = "ABC-1234";
                    carro.ano = 2020;
                    carro.cambio = true;

                    carros.add(carro);
                    System.out.println("Carro adicionado com sucesso!");
                    break;

                case 2:
                    if (carros.isEmpty()) {
                        System.out.println("Nenhum carro cadastrado.");
                        break;
                    }

                    for (int i = 0; i < carros.size(); i++) {
                        System.out.println("[" + i + "] " + carros.get(i).modelo + " - " + carros.get(i).placa);
                    }

                    System.out.print("Escolha o carro: ");
                    int indexEstado = scanner.nextInt();
                    scanner.nextLine();

                    if (indexEstado >= 0 && indexEstado < carros.size()) {
                        carros.get(indexEstado).estado();
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 3:
                    if (carros.isEmpty()) {
                        System.out.println("Nenhum carro cadastrado.");
                        break;
                    }

                    for (int i = 0; i < carros.size(); i++) {
                        System.out.println("[" + i + "] " + carros.get(i).modelo + " - " + carros.get(i).placa);
                    }

                    System.out.print("Escolha o carro: ");
                    int indexLigar = scanner.nextInt();
                    scanner.nextLine();

                    if (indexLigar >= 0 && indexLigar < carros.size()) {
                        carros.get(indexLigar).ligar();
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 4:
                    if (carros.isEmpty()) {
                        System.out.println("Nenhum carro cadastrado.");
                        break;
                    }

                    for (int i = 0; i < carros.size(); i++) {
                        System.out.println("[" + i + "] " + carros.get(i).modelo + " - " + carros.get(i).placa);
                    }

                    System.out.print("Escolha o carro: ");
                    int indexDesligar = scanner.nextInt();
                    scanner.nextLine();

                    if (indexDesligar >= 0 && indexDesligar < carros.size()) {
                        System.out.println("O carro " + carros.get(indexDesligar).modelo + " foi desligado.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 5:
                    if (carros.isEmpty()) {
                        System.out.println("Nenhum carro para remover.");
                        break;
                    }

                    for (int i = 0; i < carros.size(); i++) {
                        System.out.println("[" + i + "] " + carros.get(i).modelo + " - " + carros.get(i).placa);
                    }

                    System.out.print("Escolha o carro para remover: ");
                    int indexRemover = scanner.nextInt();
                    scanner.nextLine();

                    if (indexRemover >= 0 && indexRemover < carros.size()) {
                        carros.remove(indexRemover);
                        System.out.println("Carro removido com sucesso.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 6:
                    if (carros.isEmpty()) {
                        System.out.println("Nenhum carro cadastrado.");
                    } else {
                        for (int i = 0; i < carros.size(); i++) {
                            Carro c = carros.get(i);
                            System.out.println("\n[" + i + "] " + c.modelo + " - " + c.placa);
                            System.out.println("Marca: " + c.marca);
                            System.out.println("Ano: " + c.ano);
                            System.out.println("KM: " + c.km);
                            System.out.println("Cor: " + c.cor);
                            System.out.println("Situação: " + c.situacao);
                            System.out.println("Câmbio automático: " + c.cambio);
                            System.out.println("Observação: " + c.observacao);
                        }
                    }
                    break;

                case 7:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 7);
    }
}
