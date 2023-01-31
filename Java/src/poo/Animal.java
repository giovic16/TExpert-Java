package poo;

public class Animal {
    // Atributos
    private String nome;
    private double tamanho;
    private int tipo; // 0 - cachorro, 1 - gato

    private double tamanhoDaAsa;

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void come(){
        System.out.println("Animal comendo");
    }

    public void anda(){
        System.out.println("Animal andando");
    }

}

// Relacionamento de classes - TEM UM, composição
// Relacionamento de classes - É UM, herança