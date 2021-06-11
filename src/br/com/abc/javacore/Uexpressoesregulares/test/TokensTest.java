package br.com.abc.javacore.Uexpressoesregulares.test;

public class TokensTest {
    public static void main(String[] args) {
        String str = "Willian9 Paulo4 Joana3 Camila2 Anna3 John1 Matheus";
        String[] tokens = str.split("\\d");
        for(String arr: tokens){
            System.out.println(arr.trim());
        }
    }
}
