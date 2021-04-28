package br.com.abc.introducao.arrays;

public class Arrays2 {
    public static void main(String[] args) {
        //byte, short, int, long float, double = 0
        //char '\u0000' == ''
        //boolean false
        //reference null

        String[] nomes = new String[3];

        nomes[0]="Maria";
        nomes[1]="Samuel";
        nomes[2]="João";

        for(int i=0; i< nomes.length;i++){
            System.out.println((i+1)+" nome "+nomes[i]);
        }

        nomes = new String[4];

    }
}
