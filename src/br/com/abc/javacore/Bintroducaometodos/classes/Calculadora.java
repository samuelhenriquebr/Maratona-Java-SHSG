package br.com.abc.javacore.Bintroducaometodos.classes;

public class Calculadora {
    public static void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public static   void subtraiDoisNumeros() {
        System.out.println(5 - 5);
    }

    public static void mutiplicaDoisNumeros(double num1, int num2) {
        System.out.println(num1 * num2);
    }

    public static double divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public static void imprimeDoisNumerosDivididos(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return;
        }
        System.out.println("Não é possível dividir por zero");
    }
    public static void alteraDoisNumeros(int a, int b){
        a = 30;
        b = 40;
        System.out.println("dentro da classe");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
    public static void somaArray(int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public static void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
