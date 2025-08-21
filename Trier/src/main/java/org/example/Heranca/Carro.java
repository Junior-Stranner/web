package org.example.Heranca;

public class Carro extends Veiculo{
    int portas;


    public void abrirPortaMalas(){
        System.out.println("Abrir Porta Malas");
    }

    @Override
    public void acelerar(){
        System.out.println("O carro está acelerando de porta malas aberto...");
    }
    @Override
    public void frear(){
        System.out.println("O carro está freando de porta malas aberto: "+this.portas);

    }
}
