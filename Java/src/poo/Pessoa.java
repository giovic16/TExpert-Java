package poo;

public class Pessoa {
    // variável de classe - Atributo
    String nome, email;
    int idade;
    boolean cpf;
    double altura;

    // construtor padrao
    public Pessoa(){}

    // construtor
    public Pessoa(String nome, int idade, boolean cpf){ // receber valores enviados do parâmetro
        this.nome = nome; // setar atributos da classe
        this.idade = idade;
        this.cpf = cpf;
    }
}
