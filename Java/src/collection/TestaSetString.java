package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaSetString {
    public static void main(String[] args) {
        List<String> listaNomes = new ArrayList<>();
        listaNomes.add("Giovana");
        listaNomes.add("Victoria");
        listaNomes.add("Mendes");
        listaNomes.add("Giovana");

        // Manteve a ordem e aceitou duplicação de nomes
        System.out.println("Lista: " + listaNomes);

        // Não permite a duplicação de nomes e não imprime na ordem
        Set<String> setNomes = new HashSet<>();
        setNomes.add("Giovana");
        setNomes.add("Victoria");
        setNomes.add("Mendes");
        setNomes.add("Zeca");
        setNomes.add("Alexandre");
        setNomes.add("Giovana");

        System.out.println("Set: " + setNomes);
        System.out.println("Tamanho da lista: " + setNomes.size());
        System.out.println(setNomes.contains("Giovana"));

        for (String nome : setNomes){
            System.out.println("Nome: " + nome);
        }
    }
}
