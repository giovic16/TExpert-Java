package poo2;

public class TestaEnumMeses {
    public static void main(String[] args) {

        Meses abril = Meses.ABRIL;
        System.out.println(abril);
        System.out.println("Número do mês: " + abril.getNumeroDoMes());
        System.out.println(abril.getNomeDoMes());
    }
}
