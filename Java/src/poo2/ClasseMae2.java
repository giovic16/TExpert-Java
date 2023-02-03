package poo2;

public class ClasseMae2 {

    // FINAL não permite que a classe filha sobrescreva o método
    public final void metodo2(String met) {
        System.out.println("Método 2 da classe mãe com STRING");
    }

    public void m1(ClasseFilha2 filha2){
        filha2.i++;
        System.out.println(filha2.i);
    }
}
