package poo;

public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.nome = "Giovana";
        pessoa2.nome = "Giovana";

        System.out.println(pessoa1);
        System.out.println(pessoa2);

        if (pessoa1 == pessoa2){
            System.out.println("Pessoas iguais");
        }else{
            System.out.println("Pessoas diferentes"); // retorna pessoas diferentes por ter endereços na memória distintos
        }
    }
}
