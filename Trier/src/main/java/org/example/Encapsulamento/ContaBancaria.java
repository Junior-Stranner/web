package org.example.Encapsulamento;

public class ContaBancaria {
    private String titulo;
    private double saldo;

    public ContaBancaria(String titulo, double saldo) {
        this.titulo = titulo;
        this.saldo = saldo;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
        }else{
            System.out.println("Valor inválido para depósito");
        }
    }

    public void sacar(double valor){
        if(valor > 0){
            this.saldo -= valor;
        }else{
            System.out.println("Saldo incuficiente");
        }
    }
}
