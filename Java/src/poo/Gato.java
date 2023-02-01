package poo;

public class Gato extends Animal implements Barulhento{ // extends para herdar da classe principal
    @Override
    public void fazBarulho() {
        System.out.println("Gato miando");
    }

    public void come() {
        System.out.println("Gato comendo");
    }

    public void anda() {
        System.out.println("Gato andando");
    }
    public void miar(){

    }

    @Override
    public void respira() {

    }
}
