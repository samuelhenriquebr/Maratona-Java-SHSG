package br.com.abc.javacore.Jmodificarfinal.classes;

public class Carro {
    private static final double VELOCIDADE_FINAL= 250;
    public final Comprador comprador = new Comprador();
    private String carro;
    private String marca;

    @Override
    public String toString() {
        return "Carro{" +
                "carro='" + carro + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
    //final é utilizado no método para que o mesmo não seja sobrescrito
    public final void imprime(){
        System.out.println("Imprimindo um carro");
    }
    public Comprador getComprador() {
        return comprador;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
