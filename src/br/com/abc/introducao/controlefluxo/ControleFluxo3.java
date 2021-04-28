package br.com.abc.introducao.controlefluxo;

public class ControleFluxo3 {
    public static void main(String[] args) {
        byte dia = 4;
        //char, int, byte, short, enum e String
        switch (dia){
            case 1:
                System.out.printf("Domingo");
                break;
            case 2:
                System.out.printf("Segunda");
                break;
            case 3:
                System.out.printf("Terça");
                break;
            case 4:
                System.out.printf("Quarta");
                break;
            case 5:
                System.out.printf("Quinta");
                break;
            case 6:
                System.out.printf("Sexta");
                break;
            case 7:
                System.out.printf("Sabado");
                break;
        }
        String sexo = "FF";
        switch (sexo){
            case "F":
                System.out.printf("Feminino");
                break;
            case "M":
                System.out.printf("Masculino");
                break;
            default:
                System.out.printf("Opção Invalida");
                break;
        }
    }
}
