package org.example.Heranca.Animal;

public class AnimalMain {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();
        Jabuti jabuti = new Jabuti();

        gato.nome = "Garfield";
        gato.raca = "Pesa";
        gato.peso = 100;
        gato.sexo = 'M';
        gato.comer();
        gato.dormir();
        gato.andar();

        System.out.println();

        cachorro.nome = "Mutley";
        cachorro.raca = "Vira Lata";
        cachorro.peso = 50;
        cachorro.sexo = 'M';
        cachorro.comer();
        cachorro.dormir();
        cachorro.latir();

        System.out.println();
        jabuti.nome = "Jabuti";
        jabuti.raca = "Pesa";
        jabuti.peso = 1;
        jabuti.sexo = 'F';
        jabuti.comer();
        jabuti.dormir();
        jabuti.viver();
    }
}
