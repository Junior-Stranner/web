package org.example.ExHerancaEncapsulamento.SistemaBancario;

public class ContaCorrente extends Conta{
    private double limite;

    public ContaCorrente(Cliente cliente, double limite) {
        super(cliente);
        this.limite = limite;
    }


    @Override
    public void sacar(double valor) {
        if (!bloqueada) {
            if (valor > 0 && saldo + limite >= valor) {
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
}
