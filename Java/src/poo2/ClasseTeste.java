package poo2;

public class ClasseTeste {
    public static void main(String[] args) {
        // Object -> ClasseMae -> ClasseFilha

//        new ClasseMae();
//        new ClasseFilha("Teste");

        new ClasseMae(); // chama o construtor sem argumento
        new ClasseMae("Giovana"); // chama o construtor com string
        new ClasseMae(8); // chama o construtor com inteiro
        new ClasseMae("Giovana", "Mendes"); // chama o construtor com DUAS strings
        new ClasseMae("Giovana", 8); // chama o construtor com UMA string e UM inteiro

        new ClasseFilha("Teste");

    }
}
