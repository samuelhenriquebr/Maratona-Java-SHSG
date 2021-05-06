package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();
        aluno.nome = "Samuel";
        aluno.idade = 18;
        //aluno.notas = new double[]{5,8,9};

        aluno.imprime();
        aluno.tirarMedia();
    }
}
