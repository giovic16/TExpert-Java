package array;

import poo.Carro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaArrayCarro {
    public static void main(String[] args) {

        Carro c1 = new Carro();
        c1.setModelo("Civic");

        Carro c2 = new Carro();
        c2.setModelo("Fusion");

        Carro c3 = new Carro();
        c3.setModelo("Golf");

        // Collections: Lista, Conjuntos e Mapas

        List<Carro> carros = new ArrayList<>();
//      List<Carro> carros = new LinkedList<>();

        carros.add(c1);
        carros.add(c2);
        carros.add(c3);

        System.out.println("Tamanho da lista: " + carros.size());
        System.out.println("Lista está vazia? " + carros.isEmpty());
        System.out.println("Lista: " + carros);
        System.out.println("Carro 1: " + carros.get(1));

        for (Carro carro : carros){
            System.out.println(carro);
        }
    }

    public static void m1(List<Carro> carros) {

    }
}
