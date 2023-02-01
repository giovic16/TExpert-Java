package array;

import poo.Animal;

public class TestaZoologico {
    public static void main(String[] args) {

        // String nome - null
        // double tamanho - 0.0
        Animal animal = new Animal();
        animal.come();

        System.out.println(animal.nome);
        System.out.println(animal.tamanho);

        int[] idades = new int[5]; // 0 1 2 3 4
        idades[0] = 0;
        idades[1] = 1;
        idades[2] = 2;
        idades[3] = 3;
        idades[4] = 4;

        idades[5] = 5; // gera uma exception

    }
}
