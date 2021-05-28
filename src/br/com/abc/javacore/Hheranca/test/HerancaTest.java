package br.com.abc.javacore.Hheranca.test;

import br.com.abc.javacore.Hheranca.classes.Endereco;
import br.com.abc.javacore.Hheranca.classes.Funcionarios;
import br.com.abc.javacore.Hheranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Gina");
        p.setCpf("12345");
        Endereco end = new Endereco();
        end.setBairro("Bairro 1");
        end.setRua("Rua 25");
        p.setEndereco(end);
        p.imprime();

        System.out.println("-------------------------");

        Funcionarios f = new Funcionarios("Augusto");
        f.setCpf("645456");
        f.setSalario(1500);
        f.setEndereco(end);
        f.imprime();

    }
}
