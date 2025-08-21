package org.example.ExHerancaEncapsulamento.SistemaBancario;

public class SistemaBancario {
    public static void main(String[] args) {
        Cliente juninho = new Cliente("Juninho");
        Cliente maria = new Cliente("Maria");

        ContaCorrente cc = new ContaCorrente(juninho, -500);
        ContaPoupanca cp = new ContaPoupanca(maria);

        cc.depositar(2000);
        cc.sacar(1200);
        System.out.println("total valor na conta: "+cc.saldo);
        cc.transferir(200, cp);
        System.out.println("total valor na conta: "+cp.saldo);

        cp.depositar(300);
        System.out.println("total valor na conta: "+cp.saldo);
        cp.aplicarRendimento();
        System.out.println("total valor na conta: "+cp.saldo);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
