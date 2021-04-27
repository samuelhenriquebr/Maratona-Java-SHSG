public class ControleFluxo4 {
    public static void main(String[] args) {
        int contador =8;
        while (contador < 10) {
            System.out.println(contador++);
            //contador++;
        }
        do{
            System.out.printf("dentro do do while");
        }while (contador < 10);

        for (int i=0; i < 10; i++){
            System.out.println("valor de i é: "+i);
        }
    }
}
