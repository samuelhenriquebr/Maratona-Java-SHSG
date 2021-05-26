package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "123.234.234-03";
        prof.matricula = "23445";
        prof.nome = "Paul";
        prof.rg = "434535-3";

        Professor prof2 = new Professor();
        prof2.cpf = "123.234.234-03";
        prof2.matricula = "23445";
        prof2.nome = "Sergio";
        prof2.rg = "434535-3";

        prof.imprime();
        prof2.imprime();
    }
}
