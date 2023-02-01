package poo;

public class TestaPessoaDois {
    public static void main(String[] args) {
        new Pessoa2();
        new Pessoa2();

        Pessoa2 pessoa2 = new Pessoa2();
        System.out.println("Chamando pelo método: " + Pessoa2.getContador());
    }
}
