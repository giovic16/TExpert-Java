package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaPorformanceSet {
    public static void main(String[] args) {

        Set<Integer> listaInteiros = new HashSet<>();

        for (int i = 0; i <= 50000; i++){
            listaInteiros.add(i);
        }

        long inicio = System.currentTimeMillis();

        for (Integer inteiro : listaInteiros){
            listaInteiros.contains(inteiro);
        }

        long fim = System.currentTimeMillis();

        System.out.println("Tempo: " + (fim - inicio)); // 41 milisegundos
    }
}
