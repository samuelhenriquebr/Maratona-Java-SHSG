package br.com.abc.javacore.Sstrings.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        String s = "Uma frase comum";
        StringBuilder sb = new StringBuilder(16);
        sb.append("def").insert(3,"ghi").reverse().delete(2,4);
        System.out.println(sb);
    }
}
