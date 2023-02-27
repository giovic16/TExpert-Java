package crud;

public class Carro {
    private int id;
    private String modelo;
    private String marca;
    private int corId;
    private int ano;

    public Carro(int id, String modelo, String marca, int corId, int ano){
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.corId = corId;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return this.id + " - " + this.modelo + " - " + this.ano;
    }
}
