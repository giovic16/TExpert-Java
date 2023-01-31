package poo;

public class TestaPessoa2 {
    public static void main(String[] args) {
//        Pessoa p1 = new Pessoa();
//
//        System.out.println(p1.nome); // null
//        System.out.println(p1.email); // null
//        System.out.println(p1.idade); // 0
//        System.out.println(p1.cpf); // false
//        System.out.println(p1.altura); // 0.0

        Pessoa p1 = new Pessoa("Giovana", 20, true);
        Pessoa p2 = new Pessoa("Victoria", 22, false);

        System.out.println(p1.nome + " - " + p1.idade + " - " + p1.cpf);
        System.out.println(p2.nome + " - " + p2.idade + " - " + p2.cpf);


    }
}
