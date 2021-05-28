package br.com.abc.javacore.Hheranca.classes;

public class Funcionarios extends Pessoa {
    private double salario;

    public void imprime() {
        super.imprime();
        System.out.println("Salário: " + this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento(){
        System.out.println("Eu "+super.nome+" recebu o pagamento de "+this.salario);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
