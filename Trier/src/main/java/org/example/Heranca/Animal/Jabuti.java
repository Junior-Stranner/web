package org.example.Heranca.Animal;

public class Jabuti extends Animal{
    @Override
    void dormir(){
        System.out.println("o Jabuti está comendo");
    }
    @Override
    void andar(){
        System.out.println("o Jabuti está andando");
    }

    @Override
    void comer(){
        System.out.println("o Jabuti está dormindo");
    }

    void viver(){
        System.out.println("o Jabuti está vivendo");
    }
}
