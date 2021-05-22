package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Estudante;

import java.sql.SQLOutput;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();
        aluno.setNome("Samuel");
        aluno.setIdade(-1);
        aluno.setNotas(new double[]{5,8,9});

        aluno.imprime();
        aluno.tirarMedia();

        System.out.println(aluno.getNome());
    }
}
