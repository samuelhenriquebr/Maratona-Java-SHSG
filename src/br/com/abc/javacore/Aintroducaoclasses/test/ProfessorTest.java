package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Paulo";
        professor.matricula = "12345";
        professor.rg = "MG-12.546.429";
        professor.cpf = "123.456.789-01";

        Professor professor1 = new Professor();
        professor1.nome = "Jose";
        professor1.matricula = "435345";
        professor1.rg = "SP-12.345.342";
        professor1.cpf = "234.453.342-54";

        professor = professor1;

        System.out.println(professor.nome);
        System.out.println(professor.matricula);
        System.out.println(professor.rg);
        System.out.println(professor.cpf);
        System.out.println("--------------");
        System.out.println(professor1.nome);
        System.out.println(professor1.matricula);
        System.out.println(professor1.rg);
        System.out.println(professor1.cpf);
    }
}
