package br.com.abc.introducao.controlefluxo;

public class ControleFluxo4 {
    public static void main(String[] args) {
        int contador = 8;
        while (contador < 10) {
            System.out.println(contador++);
            //contador++;
        }
        contador = 0;
        do {
            System.out.printf("dentro do do while"+contador++);
        } while (contador < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("valor de i é: " + i);
            if(i==5){
                break;
            }
        }

    }
}
