package org.example.ExHerancaEncapsulamento.SistemaBancario;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }


    @Override
    public void sacar(double valor) {
        if (valor > 0 && !bloqueada) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque de R$ " + valor);
            } else {
                System.out.println("Saque negado: saldo insuficiente");
            }
        } else {
            System.out.println("Saque inválido ou conta bloqueada");
        }
    }

    public void aplicarRendimento() {
        if (!bloqueada) {
            double rendimento = saldo * 0.05;
            saldo += rendimento;
            System.out.println("Rendimento de R$ " + rendimento);
        } else {
            System.out.println("Conta bloqueada, rendimento não aplicado");
        }
    }
}
