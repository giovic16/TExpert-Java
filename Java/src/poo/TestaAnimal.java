package poo;

public class TestaAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.come();
        cachorro.anda();
        cachorro.latir();

        gato.come();
        gato.anda();
        gato.miar();
    }
}
