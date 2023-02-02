package collection;

import poo.Carro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestaCollections {
    public static void main(String[] args) {
//        List<String> nomes = Collections.emptyList();
        List<String> nomes = new ArrayList<>();

        nomes.add("Giovana");
        nomes.add("Victoria");
        nomes.add("Mendes");
        nomes.add("Fred");
        nomes.add("Pandora");
        nomes.add("Alexandre");

        System.out.println("Lista: " + nomes);
        System.out.println("Tamanho: " + nomes.size());

        Collections.sort(nomes); // coloca a lista em ordem alfabética
        System.out.println("Lista ordenada: " + nomes);

        List<Carro> carros = new ArrayList<>();
        carros.add(new Carro("a123", "Ford","Focus", 2012));
        carros.add(new Carro("b456", "Lamborghini","Urus", 2022));
        carros.add(new Carro("c789", "Audi","Q3", 2021));

        Collections.sort(carros);
        System.out.println("Carros: " + carros);

        List<String> asList = Arrays.asList("a", "b", "c");
        List<Carro> carroList = Arrays.asList(new Carro(), new Carro(), new Carro());

        System.out.println("Lista de uma linha só: " + asList);
    }
}
