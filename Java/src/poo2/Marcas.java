package poo2;

public enum Marcas {

    BMW("BMW"),
    MERCEDES("Mercedes"),
    LAMBORGHINI("Lamborghino"),
    FERRARI("Ferrari");

    private String descricao;

    Marcas(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
