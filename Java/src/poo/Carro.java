package poo;

public class Carro extends Veiculo {

    private String modelo;
    private String marca;


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

    @Override
    public String toString(){
        return this.modelo;
    }

}
