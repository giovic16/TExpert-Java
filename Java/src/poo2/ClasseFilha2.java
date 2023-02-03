package poo2;

public class ClasseFilha2 extends ClasseMae2{

//    public void metodo2(String met) {
//        System.out.println("Método 2 da classe filha com STRING");
//    }


    private static final int IDADE_DO_ALUNO = 10;
    public void metodo3() {
        //i++; // não permite alteração por conta do FINAL
        System.out.println("Valor: " + IDADE_DO_ALUNO); // IDADE_DO_ALUNO - constante
    }

    public int i = 15;
}
