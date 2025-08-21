package org.example.ProjetoArrayList;

public class Cliente {
    private int id;
    private String nome;
    private int idade;
    private String time;

    public Cliente(int id, String nome, int idade, String time) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade='" + idade +'\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
