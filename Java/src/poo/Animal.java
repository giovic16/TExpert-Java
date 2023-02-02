package poo;

public class Animal extends SerVivo {
    // Atributos
    public String nome;
    public double tamanho;
    private int tipo; // 0 - cachorro, 1 - gato

    private double tamanhoDaAsa;

    // métodos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

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

    @Override
    public void respira() {

    }

    public double getTamanho() {
        return tamanho;
    }
    public void setTamanho(double tamanho) {
        if (tamanho <= 0){
            throw new TamanhoInvalidoException("Tamanho de animal inválido");
        }else{
            this.tamanho = tamanho;
        }
    }
}

// Relacionamento de classes - TEM UM, composição
// Relacionamento de classes - É UM, herança