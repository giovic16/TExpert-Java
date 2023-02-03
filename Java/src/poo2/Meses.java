package poo2;

public enum Meses {

    JANEIRO("Janeiro", 1),
    FEVEREIRO("Fevereiro", 2),
    MARÇO("Março", 3),
    ABRIL("Abril", 4),
    MAIO("Maio", 5),
    JUNHO("Junho", 6),
    JULHO("Julho", 7),
    AGOSTO("Agosto", 8),
    SETEMBRO("Setembro", 9),
    OUTUBRO("Outubro", 10),
    NOVEMBRO("Novembro", 11),
    DEZEMBRO("Abril", 12);

    private String nomeDoMes;
    private int numeroDoMes;

    private Meses(String nomeDoMes, int numeroDoMes){
        this.nomeDoMes = nomeDoMes;
        this.numeroDoMes = numeroDoMes;
    }

    public String getNomeDoMes() {
        return nomeDoMes;
    }

    public int getNumeroDoMes() {
        return numeroDoMes;
    }
}
