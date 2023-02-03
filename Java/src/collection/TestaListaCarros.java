package collection;

import poo.Carro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class TestaListaCarros {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro("A1","Ford","Focus", 2013));
        carros.add(new Carro("A2","Audi","Q3", 2016));
        carros.add(new Carro("A3","Mercedes","GLE 400", 2020));
        carros.add(new Carro("A4","BMW","X6", 2019));
        carros.add(new Carro("A5","Ferrari","F458", 2023));
        carros.add(new Carro("A6","Lamborghini","Urus", 2021));

        carros.forEach(carro -> System.out.println(carro));

        System.out.println("--------------------");

        carros.removeIf(carro -> carro.getAno() < 2020);
        carros.forEach(carro -> System.out.println("Carro do ano maior que 2020: " + carro));

        System.out.println("--------------------");

        carros.sort((c1, c2) -> {
                if (c1.getAno() > c2.getAno()){
                    return 1;
                }else if (c1.getAno() < c2.getAno()) {
                    return -1;
                }else {
                    return 0;
                }
            });
        carros.forEach(carro -> System.out.println(carro));
    }
}
