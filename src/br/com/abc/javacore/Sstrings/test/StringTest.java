package br.com.abc.javacore.Sstrings.test;

public class StringTest {
    public static void main(String[] args) {
        String nome = "Samuel";
        nome = nome.concat(" Soares");
        String nome2 = "Samuel";
        String nome3 = new String("Catarina"); // 1- variável de referêcia, 2- um objeto do tipo string, 3- uma string no pool de string
        System.out.println(nome);
    }
}
