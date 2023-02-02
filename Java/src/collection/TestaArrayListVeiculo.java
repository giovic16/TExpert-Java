package collection;

import poo.Carro;
import poo.Moto;
import poo.Veiculo;

import java.util.ArrayList;

public class TestaArrayListVeiculo {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro());
        veiculos.add(new Moto());
//        veiculos.add(new Animal()); // dará erro pois animal não herda de veículo
    }
}
