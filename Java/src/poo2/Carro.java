package poo2;

public class Carro {

    private Modelos modelo;
    private Marcas marca;
    private Cores cor;

    public Carro(Modelos modelo, Marcas marca, Cores cor) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
    }

    public Modelos getModelo() {
        return modelo;
    }

    public Marcas getMarca() {
        return marca;
    }

    public Cores getCor() {
        return cor;
    };

    @Override
    public String toString() {
        return "Carro: " + this.modelo + " - " + this.marca + " - " + this.cor;
    }
}
