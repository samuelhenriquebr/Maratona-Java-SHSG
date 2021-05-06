package br.com.abc.javacore.introducaometodos.classes;

public class Estudante {
    public String nome;
    public int idade;
    public double nota1;
    public double nota2;
    public double nota3;

    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println(this.nota1);
        System.out.println(this.nota2);
        System.out.println(this.nota3);

        Double media;
        media = (nota1+nota2+nota3)/3;
        System.out.println("Média das notas: "+media);
        if(media > 6){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }

    }
}
