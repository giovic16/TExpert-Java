package poo;

public abstract class Animal extends SerVivo {
    // Atributos
    private String nome;
    private double tamanho;
    private int tipo; // 0 - cachorro, 1 - gato

    private double tamanhoDaAsa;

    public abstract void fazBarulho();

    // métodos
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void come(){
        System.out.println("Animal comendo");
    }

    public void anda(){
        System.out.println("Animal andando");
    }

    // protected - somente acessado se for do mesmo pacote e herança
    protected void m1() {

    }

}

// Relacionamento de classes - TEM UM, composição
// Relacionamento de classes - É UM, herança