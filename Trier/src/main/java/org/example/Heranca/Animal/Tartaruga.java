package org.example.Heranca.Animal;

public class Tartaruga extends Animal{

    @Override
    void dormir(){
        System.out.println("A tartaruga  está dormindo");
    }

    @Override
    void andar(){
        System.out.println("A tartaruga  está andando");
    }

    @Override
    void comer(){
        System.out.println("A tartaruga está comendo");
    }

    void nadar(){

    }
}
