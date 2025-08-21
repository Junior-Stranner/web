package org.example.AlunoListTrier;

public class Aluno {
    private int id;
    private String nome;
    private double nota1, nota2, nota3, nota4;

    public Aluno(int id, String nome, double nota1, double nota2, double nota3, double nota4) {
        this.id = id;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public int getId() {
        return id;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public String getSituacao() {
        return calcularMedia() >= 7 ? "Aprovado" : "Reprovado";
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", nota4=" + nota4 +
                ", media=" + String.format("%.2f", calcularMedia()) +
                ", situacao=" + getSituacao() +
                '}';
    }

}
