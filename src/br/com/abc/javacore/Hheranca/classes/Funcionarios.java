package br.com.abc.javacore.Hheranca.classes;

public class Funcionarios extends Pessoa {
    private double salario;
    {
        System.out.println("Bloco de incialização funcionario 1");
    }
    {
        System.out.println("Bloco de incialização funcionario 2");
    }
    static{
        System.out.println("Bloco de incialização estático de funcionario");
    }
    public Funcionarios(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }
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
