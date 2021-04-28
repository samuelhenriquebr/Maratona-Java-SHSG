package br.com.abc.introducao.controlefluxo;

public class ControleFluxo2 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 juvenil
        // idade  >= 18 adulto

        int idade = 15;
        int status;

        status = idade < 15 ? 0 :  idade >= 15 && idade < 18 ? 1: 2;

        System.out.println(status);
    }
}
