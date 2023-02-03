package poo2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TestaArredondamento {
    public static void main(String[] args) {
//        double d1 = 0.1;
//        double d2 = 0.2;
//        System.out.println(d1 + d2);

        BigDecimal d1 = new BigDecimal("0.1"); // colocar os números como string para obter o resultado esperado (0.3)
        BigDecimal d2 = new BigDecimal("0.2");
        System.out.println(d1.add(d2));

        BigDecimal d3 = new BigDecimal(1);
        BigDecimal d4 = new BigDecimal(0.2);
        System.out.println(d3.divide(d4, RoundingMode.UP));

    }
}
