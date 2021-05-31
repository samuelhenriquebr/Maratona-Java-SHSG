package br.com.abc.javacore.Jmodificarfinal.test;

import br.com.abc.javacore.Jmodificarfinal.classes.Carro;
import br.com.abc.javacore.Jmodificarfinal.classes.Comprador;

public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();
        System.out.println(c.getComprador());
        c.getComprador().setNome("Kuririn");
        System.out.println(c.getComprador());
    }
}
