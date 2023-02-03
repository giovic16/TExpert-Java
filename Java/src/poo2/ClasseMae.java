package poo2;

public class ClasseMae {

    // sobrecarga - o mesmo construtor com blocos de código e parâmetros diferentes
//    public ClasseMae() {
//        System.out.println("Construtor da classe mãe sem argumento");
//    }
//
//    public ClasseMae(String s) {
//        System.out.println("Construtor da classe mãe com string: " + s);
//    }
//
//    public ClasseMae(int i) {
//        System.out.println("Construtor da classe mãe com inteiro: " + i);
//    }
//
//    public ClasseMae(String s1, String s2) {
//        System.out.println("Construtor da classe mãe com DUAS strings: " + s1 + " - " + s2);
//    }
//    public ClasseMae(String s1, int i1) {
//        System.out.println("Construtor da classe mãe com UMA string e UM inteiro: " + s1 + " - " + i1);
//    }

    public void metodo1() {
        System.out.println("Método 1 da classe mãe");
    }

    public void metodo1(String s) {
        System.out.println("Método 1 da classe mãe com STRING");
    }

    public void metodo1(int i) {
        System.out.println("Método 1 da classe mãe com INT");
    }

    public void metodo1(String s, int i) {
        System.out.println("Método 1 da classe mãe com STRING e INT");
    }

    public void metodo1(int i, String s) {
        System.out.println("Método 1 da classe mãe com INT e STRING");
    }
}
