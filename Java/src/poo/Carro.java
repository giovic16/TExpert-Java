package poo;

public class Carro extends Veiculo {

    private String placa;
    private String modelo;
    private String marca;

    public Carro() { }

    public Carro(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void trocarMarcha(){

    }
//    @Override
//    public String toString(){
//        return "Carro modelo " + this.modelo + " da marca " + this.marca;
//    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString(){
        return this.marca + " " +this.modelo;
    }

    @Override
    public int hashCode() {
        return this.modelo.charAt(0);
    }

    @Override
    public boolean equals(Object outro) {
        Carro outroCarro = (Carro) outro;
        return this.modelo.equals(outroCarro.getModelo()); // retorna true se os modelos forem iguais
    }
}
