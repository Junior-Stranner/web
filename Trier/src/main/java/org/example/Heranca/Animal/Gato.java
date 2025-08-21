package org.example.Heranca.Animal;

public class Gato extends Animal{

    @Override
    void dormir(){
        System.out.println("O gato está dormindo");
    }

    @Override
    void andar(){
        System.out.println("O gato está andando");
    }

    @Override
    void comer(){
        System.out.println("o Gato está comendo");
    }

    void miar(){
        System.out.println("Comendo miau");
    }
}
