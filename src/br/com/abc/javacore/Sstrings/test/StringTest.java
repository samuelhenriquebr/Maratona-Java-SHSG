package br.com.abc.javacore.Sstrings.test;

import java.util.Locale;

public class StringTest {
    public static void main(String[] args) {
        String nome = "Samuel";
        nome = nome.concat(" Soares");
        String nome2 = "Samuel";
        String nome3 = new String("Catarina"); // 1- variável de referêcia, 2- um objeto do tipo string, 3- uma string no pool de string

        String teste = "Goku";
        String teste2 = "       aaaaaaagoku        ";
        System.out.println(teste.charAt(2));
        System.out.println(teste.equalsIgnoreCase(teste2));
        System.out.println(teste.length());
        System.out.println(teste2.replace('a','o'));
        System.out.println(teste.toLowerCase());
        System.out.println(teste.toUpperCase());
        System.out.println(teste2.substring(0,5));
        System.out.println(teste2.trim());
    }
}
