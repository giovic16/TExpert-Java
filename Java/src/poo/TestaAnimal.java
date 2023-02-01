package poo;

import testeDois.Passaro;

public class TestaAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.come();
        animal.anda();

        Cachorro cachorro = new Cachorro();
        cachorro.come();
        cachorro.anda();

        Gato gato = new Gato();
        gato.come();
        gato.anda();

        Passaro passaro = new Passaro();
        passaro.m1();
    }
}
