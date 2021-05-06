package br.com.abc.javacore.introducaometodos.classes;

public class Estudante {
    public String nome;
    public int idade;
    public double notas[];

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (notas != null) {
            for (double nota : notas) {
                System.out.print(nota + " ");
            }
        }
    }

    public void tirarMedia(){
        if(notas == null){
            System.out.println("Esse aluno não possui notas");
            return;
        }
        double media =0;
        for(double nota: notas){
            media += nota;
        }
        media = media / notas.length;

        if(media > 6){
            System.out.println("\nMédia das notas: "+media+" situação: Aprovado");
        }else{
            System.out.println("\nMédia das notas: "+media+" situação: Reprovado");
        }
    }
}
