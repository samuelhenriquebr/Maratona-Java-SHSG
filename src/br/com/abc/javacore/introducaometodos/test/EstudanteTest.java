package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();
        aluno.nome = "Samuel";
        aluno.idade = 18;
        aluno.nota1 = 6;
        aluno.nota2 = 9;
        aluno.nota3 = 10;

        aluno.imprime();
    }
}
