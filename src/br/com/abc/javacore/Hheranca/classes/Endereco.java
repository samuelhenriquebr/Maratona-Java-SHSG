package br.com.abc.javacore.Hheranca.classes;

public class Endereco {
    private String rua;
    private String bairro;
    public void imprime(){
        System.out.println("Rua: "+this.rua);
        Pessoa p = new Pessoa();
        p.nome = "sasasa";
    }
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
