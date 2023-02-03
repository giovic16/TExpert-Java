package estudos;

public class TestaString2 {
    public static void main(String[] args) {
        // mutável
        StringBuilder nome = new StringBuilder("Giovana");

        System.out.println(nome);
        System.out.println("Adiciona o sobrenome: " + nome.append(" Mendes"));
        System.out.println("Escreve o nome ao contrário: " + nome.reverse());
    }
}
