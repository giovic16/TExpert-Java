package poo;

public class Pessoa2 {
    // Attributo (variável de objeto)
    private static int contador;
    public Pessoa2() {
        System.out.println("Pessoa criada");
        contador++;
    }

    public static int getContador() {
        return contador;
    }
}
