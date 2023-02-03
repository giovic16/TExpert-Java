package poo2;

import java.math.BigDecimal;

public class TestaDecimal {
    public static void main(String[] args) {

//        double d1 = 0.1;
//        double d2 = 0.2;
//        System.out.println(d1 + d2);

        BigDecimal bd1 = new BigDecimal(10);
        BigDecimal bd2 = new BigDecimal(5);


//        BigDecimal soma = bd1.add(bd2); // Isso
//        System.out.println(soma);


        System.out.println("Soma BigDecimal: " + bd1.add(bd2)); // igual a isso
        System.out.println("Subtração BigDecimal: " + bd1.subtract(bd2));
        System.out.println("Divisão BigDecimal: " + bd1.divide(bd2));
        System.out.println("Multiplicação BigDecimal: " + bd1.multiply(bd2));
        System.out.println("Maior número BigDecimal: " + bd1.max(bd2));
        System.out.println("Menor número BigDecimal: " + bd1.min(bd2));
        System.out.println("Compare BigDecimal: " + bd1.compareTo(bd2)); // 1 = primeiro > segundo | -1 = segundo > primeiro | 0 = primeiro == segundo
        System.out.println("Número ao quadrado BigDecimal: " + bd1.pow(2));
    }
}
