package poo;

public class TestaZoologico {
    public static void main(String[] args) {

        Zoologico zoo = new Zoologico();
        // Polimorfismo -> objeto referenciado por mais de um tipo
        // cachorro é um animal (herança e polimorfismo)
        zoo.alimenta(new Cachorro());
        zoo.alimenta(new Gato());
        zoo.alimenta(new Peixe());


    }
}
