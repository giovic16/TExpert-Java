package estudos;

public class TestaString {
    public static void main(String[] args) {
        // imutável
        String nome = new String("Giovana");
        String sobrenome = new String("Mendes");

        System.out.println("Nome: " + nome);
        System.out.println("A String está vazia? " + nome.isEmpty());
        System.out.println("Nome em maiúsculas: " + nome.toUpperCase());
        System.out.println("Nome em minúsculas: " + nome.toLowerCase());
        System.out.println("Imprime a letra do nome de acordo com indice passado: " + nome.charAt(0));
        System.out.println("Concatena nome com sobrenome: " + nome.concat(" " + sobrenome));
        System.out.println("Verifica se existe um nome com os caracteres dentro de contains: " + nome.contains("Giov"));
        System.out.println("Start: " + nome.startsWith("Gio"));
        System.out.println("End: " + nome.endsWith("ana"));
        System.out.println("Tamanho do nome: " + nome.length());
        System.out.println("Troca um caracter por outro: " + nome.replace('i', 'e'));

    }
}
