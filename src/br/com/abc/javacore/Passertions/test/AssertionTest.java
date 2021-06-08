package br.com.abc.javacore.Passertions.test;

public class AssertionTest {
    public static void main(String[] args) {
        diasDaSemana(-1000);
    }

    private static void calculaSalario(double salario) {
        assert (salario > 0): "O salário não deve ser menor do que zero, o salário veio: "+salario;
        //calculo do salario
    }
    public static void diasDaSemana(int dia){
        switch (dia){
            case 1:break;
            case 2:break;
            case 3:break;
            case 4:break;
            case 5:break;
            case 6:break;
            case 7:break;
            default: assert false;
        }
    }
}
