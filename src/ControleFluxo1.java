public class ControleFluxo1 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 juvenil
        // idade  >= 18 adulto
        int idade =14;
        String categoria = "";
        float salario = 1000;
        boolean c =false;
        if(idade < 15){
            categoria = "infantil";
        }else if (idade >= 15 && idade < 18){
            categoria = "juvenil";
        }else{
            categoria = "adulto";
        }
        System.out.println(categoria);
    }
}
