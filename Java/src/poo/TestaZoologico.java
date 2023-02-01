package poo;

public class TestaZoologico {
    public static void main(String[] args) {

        Zoologico zoo = new Zoologico();

        zoo.alimenta(new Cachorro());
        zoo.alimenta(new Gato());
        zoo.alimenta(new Peixe());


        // Polimorfismo -> objeto referenciado por mais de um tipo
        // cachorro é um animal (herança e polimorfismo)
    }
}
