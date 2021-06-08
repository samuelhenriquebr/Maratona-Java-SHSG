package br.com.abc.javacore.Oexception.checkedexception.test;

import br.com.abc.javacore.Oexception.checkedexception.classes.Funcionario;
import br.com.abc.javacore.Oexception.checkedexception.classes.Pessoa;
import br.com.abc.javacore.Oexception.customexception.LoginInvalidoException;

import java.io.IOException;

public class SobrescritaComExceptionsTest {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        Pessoa p = new Pessoa();

        try {
            p.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
