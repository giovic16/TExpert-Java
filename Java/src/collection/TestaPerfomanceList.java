package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestaPerfomanceList {
    public static void main(String[] args) {

//        List<Integer> listaInteiros = new ArrayList<>();
        Collection<Integer> listaInteiros = new ArrayList<>();


        for (int i = 0; i <= 50000; i++){
            listaInteiros.add(i);
        }

        long inicio = System.currentTimeMillis();

        for (Integer inteiro : listaInteiros){
            listaInteiros.contains(inteiro);
        }

        long fim = System.currentTimeMillis();

        System.out.println("Tempo: " + (fim - inicio)); // 3233 milisegundos
    }
}
