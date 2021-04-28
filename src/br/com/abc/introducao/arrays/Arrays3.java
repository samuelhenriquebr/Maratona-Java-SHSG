package br.com.abc.introducao.arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] numeros2 = {1, 2, 3, 4, 5}; //tamanho é 5, index de 0 até 4
        int[] numeros3 = new int[]{1, 2, 3, 4, 5};

        int i = 0;
        for (i = 0; i < 5; i++) {
            System.out.println(numeros2[i]);
        }

        for (int num : numeros2) {
            System.out.println(num);
        }
    }
}
