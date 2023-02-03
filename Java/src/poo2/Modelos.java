package poo2;

public enum Modelos {

    X6("X6"),
    GLE400("GLE 400"),
    URUS("Urus"),
    F458("F458");
    private String descricao;

    Modelos(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
