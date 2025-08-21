package org.example.ExHerancaEncapsulamento.SistemaBancario;

public class ContaCorrente extends Conta{
    private double limite;

    public ContaCorrente(Cliente cliente, double limite) {
        super(cliente);
        this.limite = limite;
    }


    @Override
    public void sacar(double valor) {
        if (valor > 0 && !bloqueada) {
            if (saldo - valor < -limite) {
                System.out.println("Saque não permitido: limite ultrapassado");
            } else {
                saldo -= valor;
            }
        } else {
            System.out.println("Saque inválido ou conta bloqueada");
        }
    }
}
