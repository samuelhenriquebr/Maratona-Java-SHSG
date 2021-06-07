package br.com.abc.javacore.Oexception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {
        System.out.println(abrirArquivo());

    }

    public static void criarArquivo() throws IOException {
        File file = new File("Teste.txt");
        try {
            System.out.println("Arquivo criado? : " + file.createNewFile());
            System.out.println("Arquivo criado");
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static String abrirArquivo() {
        File file = new File("Teste.txt");
        try {
            System.out.println("Abrindo um arquivo");
            System.out.println("Executando a leitura do arquivo");
            //throw new Exception();
            System.out.println("Escrevendo no arquivo");
            return "Valor";
        } catch (Exception e) {
            System.out.println("Dentro do Catch");
            e.printStackTrace();
        } finally {
            System.out.println("Fechar o arquivo");
        }
        return null;
    }
}
