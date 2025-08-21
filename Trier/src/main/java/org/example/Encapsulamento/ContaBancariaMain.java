package org.example.Encapsulamento;

public class ContaBancariaMain {
    public static void main(String[] args) {


        ContaBancaria conta = new ContaBancaria("Junior", 10000);

        conta.depositar(5000);
        conta.sacar(1000);

        System.out.println("Titulo: "+conta.getTitulo()+"\n" +
                "Saldo: "+conta.getSaldo());
    }
}
