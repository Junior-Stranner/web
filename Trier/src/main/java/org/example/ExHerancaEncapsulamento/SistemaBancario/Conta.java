package org.example.ExHerancaEncapsulamento.SistemaBancario;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    protected  Cliente cliente;
    protected double saldo;
    protected boolean bloqueada = false;
    protected List<String> extrato = new ArrayList<>();
    protected LocalDate diasNegativo;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.diasNegativo = null;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setDiasNegativo(LocalDate diasNegativo) {
        this.diasNegativo = diasNegativo;
    }

    public abstract void sacar(double valor);


    public void depositar(double valor) {
        if (!bloqueada) {
            if (valor > 0) {
                saldo += valor;
                extrato.add("Depósito de R$ " + valor);
                System.out.println("Depósito de R$ " + valor);
                if (saldo >= 0) {
                    diasNegativo = LocalDate.now();
                }
            } else {
                System.out.println("Depósito inválido");
            }
        } else {
            System.out.println("Conta bloqueada. Operação não permitida.");
        }
    }

    public void transferir(double valor, Conta destino) {
        if (destino != null) {
            this.sacar(valor);
            if(!bloqueada){
                destino.depositar(valor);
                extrato.add("Transferência de R$ " + valor + " para " + destino.cliente.getNome());
                System.out.println("Transferência de R$ " + valor + " para " + destino.cliente.getNome());
            }
        } else {
            System.out.println("Transferência não realizada. Conta bloqueada.");
        }
    }

    public void imprimirExtrato() {
        System.out.println("\nExtrato da conta de " + cliente.getNome());
        for (String mov : extrato) {
            System.out.println(mov);
        }
        System.out.println("Saldo atual: R$ " + saldo);
    }


    public void verificarBloqueio() {
        if (saldo < 0) {
            if (diasNegativo == null) {
                diasNegativo = LocalDate.now();
            } else {
                long dias = ChronoUnit.DAYS.between(diasNegativo, LocalDate.now());
                if (dias > 30) {
                    bloqueada = true;
                    extrato.add("Conta bloqueada por saldo negativo por mais de 30 dias.");
                    System.out.println("Conta bloqueada por saldo negativo por mais de 30 dias!");
                }
            }
        } else {
            diasNegativo = null;
        }
    }
}
