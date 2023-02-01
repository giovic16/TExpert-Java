package poo;

public class Cachorro extends Animal implements Barulhento{

    @Override
    public void fazBarulho() {
        System.out.println("Cachorro latindo");
    }

    public void come() {
        System.out.println("Cachorro comendo");
    }

    public void anda() {
        System.out.println("Cachorro andando");
    }

    public void latir(){

    }

    @Override
    public void respira() {

    }
}
