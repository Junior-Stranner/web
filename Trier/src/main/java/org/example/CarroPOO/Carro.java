package org.example.CarroPOO;

public class Carro {
    public String modelo;
    public String km;
    public String cor;
    public String marca;
    public String situacao; // "bom" ou "ruim"
    public String observacao;
    public String placa;
    public int ano;
    public boolean cambio;

    void andar() {
        if ("bom".equalsIgnoreCase(situacao)) {
            System.out.println("O carro " + modelo + " está andando.");
        } else {
            System.out.println("O carro " + modelo + " está com problemas e não pode andar.");
        }
    }

    void estado() {
        if ("bom".equalsIgnoreCase(situacao)) {
            System.out.println("O carro está em bom estado.");
        } else {
            System.out.println("O carro está em mau estado.");
        }
    }

    void freiar() {
        System.out.println("O carro " + modelo + " está freando.");
    }

    void ligar() {
        if ("bom".equalsIgnoreCase(situacao)) {
            System.out.println("O carro " + modelo + " foi ligado.");
        } else {
            System.out.println("O carro " + modelo + " não liga devido ao seu estado.");
        }
    }

    void acelerar() {
        if ("bom".equalsIgnoreCase(situacao)) {
            System.out.println("O carro " + modelo + " está acelerando.");
        } else {
            System.out.println("O carro " + modelo + " não pode acelerar devido ao seu estado.");
        }
    }
}
