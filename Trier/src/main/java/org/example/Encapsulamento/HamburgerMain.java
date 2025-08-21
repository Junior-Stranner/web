package org.example.Encapsulamento;

public class HamburgerMain {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger();

        hamburger.adicionarIngrediente("Pão");
        hamburger.adicionarIngrediente("Queijo");
        hamburger.adicionarIngrediente("Coração");
        hamburger.adicionarIngrediente("Barbecue");
        hamburger.adicionarIngrediente("Bacon");
        hamburger.adicionarIngrediente("Cebola Caramelizada");
        hamburger.adicionarIngrediente("Maionesse caseira da casa");

        hamburger.mostrarLista();
    }
}
