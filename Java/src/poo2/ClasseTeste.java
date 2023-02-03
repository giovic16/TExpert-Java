package poo2;

public class ClasseTeste {
    public static void main(String[] args) {
        // Object -> ClasseMae -> ClasseFilha

//        new ClasseMae();
//        new ClasseFilha("Teste");
//        new ClasseMae(); // chama o construtor sem argumento
//        new ClasseMae("Giovana"); // chama o construtor com string
//        new ClasseMae(8); // chama o construtor com inteiro
//        new ClasseMae("Giovana", "Mendes"); // chama o construtor com DUAS strings
//        new ClasseMae("Giovana", 8); // chama o construtor com UMA string e UM inteiro
//
//        new ClasseFilha("Teste");

//        ClasseFilha filha = new ClasseFilha();
//        filha.metodo1(2);

        ClasseMae mae = new ClasseMae();
        //Sobrecarga:
        mae.metodo1();
        mae.metodo1("Giovana");
        mae.metodo1(10);
        mae.metodo1("Giovana", 10);
        mae.metodo1(10,"Giovana");

        System.out.println("----------------------------------------");

        ClasseFilha filha = new ClasseFilha();
        filha.metodo1();
        filha.metodo1("Victoria");
        filha.metodo1(8);
        filha.metodo1("Victoria", 8);
        filha.metodo1(8, "Victoria");
        filha.metodo1(8.0);
    }
}
