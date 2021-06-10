package br.com.abc.javacore.Uexpressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {
    public static void main(String[] args) {
        // \d - todos os digitos
        // \D - tudo o que não for digito
        // \s - espaços em branco \t \n \f \r
        // \S - caractere que não é branco
        // \w - caracteres de palavras a-z A-Z, digitos e _
        // \W - tudo que não for caractere de palavra
        // [] - range
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n até m ocorrências
        // ()
        // | OU
        // $ fim de linha
        // o(v|c)o = ovo, oco
        // maca(rr|c)ão = macarrão, macacão
        // . coringa 1.3 = 123, 133, 1A3, 1#3, 1 3
        // ^ Ex: [^abc]caractere de negação, excluir algo indesejado
        int numeroHex = 0x1;
//        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
//        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
//        String regex = "(\\w\\.)+@([a-zA-Z])+(\\.([a-zA-z])+)+";
//        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-z])+)+";
//        String texto = "fulano@hotmail.com, 12Abc@gmail.com, #@!abrao@mail.br, teste@gmail.com.br, teste@mal";
//        String regex = "\\d{2}/\\d{2}/\\d{2,4}";
//        String texto = "05/10/2010 05/05/2015 01/05/95"; // dd/MM/yyyy

        String regex = "proj([^,])*";
        String texto = "proje1.bkp, proj1.java, proj1.class, proj1final.java, proj2.bkp, proj3.java, diagrama, texto, foto"; // dd/MM/yyyy

//        System.out.println("Email válido? "+"#@!abrao@mail.br".matches(regex));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("expressao: "+matcher.pattern());
        System.out.println("posicoes encontradas");
        while(matcher.find()){
            System.out.println(matcher.start() + " "+matcher.group());
        }
    }
}
