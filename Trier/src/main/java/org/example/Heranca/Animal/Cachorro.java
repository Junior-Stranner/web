package org.example.Heranca.Animal;

public class Cachorro extends Animal{

    @Override
    void dormir(){
        System.out.println("Cachoro está comendo");
    }
    @Override
    void andar(){
        System.out.println("Cachorro está andando");
    }

    @Override
    void comer(){
        System.out.println("O Cahcorro está comendo");
    }
    void latir(){
        System.out.println("Latir");
    }
}
