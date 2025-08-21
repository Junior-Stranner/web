package org.example.Heranca;

public class VeiculoMain {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca  = "Toyota";
        carro.anoFabricacao = 2000;
        carro.portas = 4;
        carro.abrirPortaMalas();
        carro.acelerar();
        carro.frear();

        Moto moto = new Moto();
        moto.marca  = "Honda";
        moto.anoFabricacao = 1995;
        moto.acelerar();
        moto.frear();
        moto.empinar();
    }
}
