package collection;

import java.util.Optional;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public Optional<String> getNome() {
        return Optional.of(nome);
    }
    public int getIdade() {
        return idade;
    }
}
