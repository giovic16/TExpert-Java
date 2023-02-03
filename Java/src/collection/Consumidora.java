package collection;

import java.util.function.Consumer;

public class Consumidora implements Consumer<String> {
    // primeira opção
    @Override
    public void accept(String nome) {
        System.out.println(nome);
    }
}
