package org.example.ExHerancaEncapsulamento.SistemaBancario;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    protected  Cliente cliente;
    protected double saldo;
    protected boolean bloqueada = false;
    protected List<String> extrato = new ArrayList<>();
    protected int numero;
    protected int diasNegativos = 0;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.numero = diasNegativos++;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor);
        } else {
            System.out.println("Depósito inválido");
        }
    }

    public abstract void sacar(double valor);


    public void transferir(double valor, Conta destino) {
        if (destino != null) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " para " + destino.cliente.getNome());
        }
    }

    public void imprimirExtrato() {
        System.out.println("\nExtrato da conta de " + cliente.getNome());
        for (String mov : extrato) {
            System.out.println(mov);
        }
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public void bloquear() {
        if (saldo < 0) {
            diasNegativos++;
            if (diasNegativos > 30) {
                bloqueada = true;
                System.out.println("Conta bloqueada por saldo negativo por mais de 30 dias!");
            } else {
                System.out.println("Conta negativa há " + diasNegativos + " dias. Ainda não será bloqueada.");
            }
        } else {
            diasNegativos = 0;
        }
    }

}
