package collection;

import poo.Carro;

import java.util.HashMap;
import java.util.Map;

public class TestaMap {
    public static void main(String[] args) {

        Carro c1 = new Carro("a123", "Ford","Focus", 2010);
        Carro c2 = new Carro("b456", "Lamborghini","Urus", 2015);
        Carro c3 = new Carro("c789", "Audi","Q3", 2020);

        // Map não mantém uma ordem
        Map<String, Carro> veiculos = new HashMap<>();
        veiculos.put(c1.getPlaca(), c1);
        veiculos.put(c2.getPlaca(), c2);
        veiculos.put(c3.getPlaca(), c3);

        System.out.println("Tamanho: " + veiculos.size());
        System.out.println("Veiculos: " + veiculos);
        veiculos.remove(c1.getPlaca());
        System.out.println("Tamanho: " + veiculos.size());
        System.out.println("Veiculos: " + veiculos);
        System.out.println("Existe veiculo Mercedes? " + veiculos.containsKey(c3.getPlaca()));
    }
}
