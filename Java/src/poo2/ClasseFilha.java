package poo2;

public class ClasseFilha extends ClasseMae{
    public ClasseFilha(String s){
        super(s, 10);
        System.out.println("Construtor da classe Filha: " + s);
    }
}
