package org.example.AlunoListTrier;

import java.util.ArrayList;

public class GerenciadorAlunos {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            for (Aluno a : alunos) {
                System.out.println(a.toString());
            }
        }
    }

    public Aluno buscarAlunoPorId(int id) {
        for (Aluno a : alunos) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    public void removerTodosAlunos() {
        alunos.clear();
        System.out.println("Todos os alunos foram removidos.");
    }
}
