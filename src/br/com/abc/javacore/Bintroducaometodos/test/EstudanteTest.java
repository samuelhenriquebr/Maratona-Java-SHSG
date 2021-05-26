package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();
        aluno.setNome("Samuel");
        aluno.setIdade(-1);
        aluno.setNotas(new double[]{5,8,3});

        aluno.imprime();
        aluno.tirarMedia();

        System.out.println(aluno.getNome());

        System.out.println("Aprovado? "+aluno.isAprovado());
    }
}
