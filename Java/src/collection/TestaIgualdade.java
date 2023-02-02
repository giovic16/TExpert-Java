package collection;

import poo.Carro;

public class TestaIgualdade {
    public static void main(String[] args) {
        String nome1 = "Giovana";
        String nome2 = "Victoria";
        String nome3 = "Giovana";

        System.out.println("String: " + (nome1.equals(nome2))); // false
        System.out.println("String: " + (nome1.equals(nome3))); // true - na classe string, se for as palavras forem iguais retorna true, independente do endereço salvo na memória

        Carro carro1 = new Carro();
        carro1.setModelo("Focus");

        Carro carro2 = new Carro();
        carro2.setModelo("Focus");

//        System.out.println("Carro: " + (carro1 == carro2));
        System.out.println("Carro: " + (carro1.equals(carro2)));

//        Object obj = new Object();
//        obj.equals(carro2);

    }
}
