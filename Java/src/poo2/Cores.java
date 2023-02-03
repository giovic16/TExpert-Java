package poo2;

public enum Cores {
    AZUL ("Azul"),
    ROSA ("Rosa"),
    PRETO ("Preto"),
    BRANCO ("Branco"),
    VERMELHO ("Vermelho"),
    CINZA ("Cinza");

    private String descricao;

    Cores(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}
