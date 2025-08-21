package org.example.Encapsulamento;

import java.util.ArrayList;

public class Hamburger {
    private ArrayList<String> ingredientes = new ArrayList<>();

    public void adicionarIngrediente(String ingrediente){
        if(ingrediente != null || !ingredientes.isEmpty()){
            ingredientes.add(ingrediente);
        }else{
            System.out.println("Erro ao adicionar ingrediente!\n " +
                    "Null ou vazio");
        }
    }

    public void mostrarLista(){
        System.out.println("Hamburger com "+ingredientes.size()+" ingredientes");
    }
}
