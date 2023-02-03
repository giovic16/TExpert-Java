package poo2;

public class ClasseFilha extends ClasseMae{
//    public ClasseFilha(String s){
//        super(s, 10);
//        System.out.println("Construtor da classe Filha: " + s);
//    }

    // Override - mesmo nome e mesmos parâmetros
//    public void metodo1(int i) { // este método não é o mesmo da classe mãe, pois ele possui parâmetro
//        System.out.println("Método 1 sobrescrito na classe filha: " + i);
//    }
    // só acontece OVERRIDE (SOBRESCRITA) se o método respeitar a regra de nome e parâmetros
    // só acontece OVERLOAD (SOBRECARGA) se o método alterar os parâmetros

    public void metodo1() {
        System.out.println("Método 1 da classe filha");
    }

    public void metodo1(String s) {
        System.out.println("Método 1 da classe filha com STRING");
    }

    public void metodo1(int i) {
        System.out.println("Método 1 da classe filha com INT");
    }

    public void metodo1(String s, int i) {
        System.out.println("Método 1 da classe filha com STRING e INT");
    }

    public void metodo1(int i, String s) {
        System.out.println("Método 1 da classe filha com INT e STRING");
    }

    public void metodo1(double d) {
        System.out.println("Metodo 1 da classe filha com double: " + d);
    }
}
