package collection;

import poo.Carro;

import java.util.HashSet;
import java.util.Set;

public class TestaSetCarros {
    public static void main(String[] args) {

        Carro c1 = new Carro();
        c1.setModelo("Focus");
        c1.setMarca("Ford");

        Carro c2 = new Carro();
        c2.setModelo("Urus");
        c2.setMarca("Lamborghini");

        Carro c3 = new Carro();
        c3.setModelo("X6");
        c3.setMarca("BMW");

        Carro c4 = new Carro();
        c4.setModelo("GLE 400");
        c4.setMarca("Mercedes");

        Carro c5 = new Carro();
        c5.setModelo("GLE 400");
        c5.setMarca("Mercedes");

        Set<Carro> carros = new HashSet<>();
        carros.add(c1);
        carros.add(c2);
        carros.add(c3);
        carros.add(c4);
        carros.add(c5);

        System.out.println("Conjunto: " + carros);
    }
}
