package dao;

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

    public Carro(String modelo, String marca, int corId, int ano){
        this.modelo = modelo;
        this.marca = marca;
        this.corId = corId;
        this.ano = ano;
    }



    public String getModelo() {
        return modelo;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public int getCorId() {
        return corId;
    }

    public int getAno() {
        return ano;
    }

    public void setCorId(int corId) {
        this.corId = corId;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", corId=" + corId +
                ", ano=" + ano +
                '}';
    }
}
