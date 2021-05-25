package br.com.abc.javacore.sobrecargametodos.test;

import br.com.abc.javacore.sobrecargametodos.classes.Funcionario;

public class FuncionariosTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.init("Chica da Silva","123.434.543-44", 4500, "12334234");

        funcionario.imprime();
    }
}
