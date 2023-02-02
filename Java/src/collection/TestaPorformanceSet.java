package collection;

import java.util.*;

public class TestaPorformanceSet {
    public static void main(String[] args) {

//        Set<Integer> listaInteiros = new HashSet<>();
        Collection<Integer> listaInteiros = new HashSet<>();


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
