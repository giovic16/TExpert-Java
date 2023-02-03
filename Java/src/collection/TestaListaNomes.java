package collection;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestaListaNomes {
    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("Giovana", "Victoria", "Mendes", "Fred", "Alexandre", "Zeca");

//        Consumidora consumidora = new Consumidora();

        // terceira opção - Lambda (sugar sintaxe)
        nomes.forEach(nome -> System.out.println(nome)); // se possui apenas uma instrução, não é necessário ; e {}

        // Segunda opção
//        nomes.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String nome) {
//                System.out.println(nome);
//            }
//        });

//         isso
//        nomes.forEach(consumidora); // primeira opção

//         é igual a isso
//        for (String nome: nomes) {
//            System.out.println(nomes);
//        }
    }
}
