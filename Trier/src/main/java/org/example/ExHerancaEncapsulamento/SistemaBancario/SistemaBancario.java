package org.example.ExHerancaEncapsulamento.SistemaBancario;

import java.time.LocalDate;

public class SistemaBancario {
    public static void main(String[] args) {
        Cliente juninho = new Cliente("Juninho");
        Cliente maria = new Cliente("Maria");

        ContaCorrente cc = new ContaCorrente(juninho, 500);
        ContaPoupanca cp = new ContaPoupanca(maria);

        cc.depositar(1000);
        cc.setDiasNegativo(LocalDate.now().minusDays(35));
        cc.sacar(1200);
        cc.transferir(200, cp);

        cp.depositar(300);
        cp.aplicarRendimentoMensal();

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
