package org.example.Heranca;

public class Moto extends  Veiculo{
    public void empinar(){
        System.out.println("A moto está empinando");
    }


    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando");
    }

    @Override
    public void frear() {
        System.out.println("A moto está freando e empinando ao contrário");
    }
}
