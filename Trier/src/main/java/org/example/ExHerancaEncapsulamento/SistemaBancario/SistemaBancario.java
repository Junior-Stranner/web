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
        System.out.println("Total valor na conta: "+cc.getSaldo());
        cc.transferir(200, cp);
        System.out.println("total valor na conta: "+cc.getSaldo());

        cp.depositar(300);
        System.out.println("total valor na conta: "+cc.getSaldo());
        cp.aplicarRendimentoMensal();
        System.out.println("total valor na conta: "+cc.getSaldo());

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
