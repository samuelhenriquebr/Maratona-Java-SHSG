package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.mutiplicaDoisNumeros(55.5, 5);
        System.out.println("divisão de dois numeros");
        double result = calc.divideDoisNumeros(20,0);
        System.out.println(result);
        System.out.println("imprime dois numeros dividos");
        calc.imprimeDoisNumerosDivididos(20,4);
        System.out.println("Continuando a exec");
    }
}
