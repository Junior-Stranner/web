package org.example.PessoaPOO;

public class SistemaPrincipal {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Rafael";
        pessoa.idade = 22;
        pessoa.sexo = "Masculino";
        pessoa.peso = 100.0;
        pessoa.altura = 1.78;
        pessoa.cpf = "31534645745";
        pessoa.cpdigo = 1;
        pessoa.cansado = true;
        pessoa.descansar();
        pessoa.trabalhar();
    }
}
