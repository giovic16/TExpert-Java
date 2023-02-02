package collection;

public class SalaDeAula {
    public static void main(String[] args) {
        // Array de notas dos alunos do tipo double
        // Array é imutável: não podemos alterar o seu valor

        double[] notas = new double[50];
        notas[1] = 10;

        System.out.println("Array: " + notas);
        System.out.println("Tamanho do array: " + notas.length);
        System.out.println("Posição 1: " + notas[1]);

        // Novo array
        int[] idades = new int[10];
        for (int i = 0; i < idades.length; i++){ // i vai de 0 a 9 preenchendo o array idade com seus valores (0 a 9)
            idades[i] = i;
        }
//        for (int i = 0; i < idades.length; i++){
//            System.out.println("Idades: " + idades[i]);
//        }

        // foreach
        for (int d : idades){
            System.out.println("Idades: " + d);
        }
    }
}
