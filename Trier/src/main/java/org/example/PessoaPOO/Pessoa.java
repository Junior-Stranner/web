package org.example.PessoaPOO;

public class Pessoa {
    String nome;
    int idade;
    String sexo;
    double peso;
    double altura;
    String cpf;
    int cpdigo;
    boolean cansado;


    void trabalhar(){
      if(this.cansado == true){
          System.out.println("Você precisa descansar e não pode trabalhar");
      }else{
          System.out.println("Você deve Trabalhar hoje");
      }
    }
    void descansar() {
        if (this.cansado == true) {
            System.out.println("Você precisa descansar!");
        } else {
            System.out.println("Você deve fazer alguma coisa hoje");
        }
    }
}
