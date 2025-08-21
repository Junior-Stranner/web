package org.example.ExHerancaEncapsulamento.SistemaBancario;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }


    @Override
    public void sacar(double valor) {
        if (!bloqueada) {
            if (valor > 0 && saldo >= valor) {
                saldo -= valor;
                extrato.add("Saque de R$ " + valor);
                System.out.println("Saque de R$ " + valor);
            } else {
                System.out.println("Saldo insuficiente!");
            }
            verificarBloqueio();
        } else {
            System.out.println("Conta bloqueada. Operação não permitida.");
        }
    }

    public void aplicarRendimentoMensal() {
        if (!bloqueada && saldo > 0) {
            double rendimento = saldo * 0.05;
            saldo += rendimento;
            extrato.add("Rendimento mensal de R$ " + rendimento);
            System.out.println("Rendimento mensal aplicado: R$ " + rendimento);
        }
    }
}
