package poo2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaWrapper {
    public static void main(String[] args) {

        // Classe, Interface e Enum
        // byte - Byte
        // short - Short
        // int - Integer
        // Long - Long
        // float - FLoat
        // double - Double
        // boolean - Boolean
        // char - Character

        Integer i = Integer.parseInt("8");
        System.out.println("Primeira opção: " + i);

        Integer i2 = Integer.valueOf(8);
        System.out.println("Segunda opção: " + i2);

        Integer i3 = 8; // autoboxing
        System.out.println("Terceira opção: " + i3);

        Long l = 2000000l;
        Boolean bool = false;
        Integer i4 = 8; // autoboxing
        System.out.println("Quarta opção: " + i4);

        int i5 = i.intValue(); // unboxing
        System.out.println("Quinta opção: " + i5);

        Byte b = Byte.valueOf((byte) 8);
        System.out.println("Byte: " + b);

        Short s = Short.valueOf((short) 8);
        System.out.println("Short: " + s);

        Integer integer = Integer.valueOf(8);
        System.out.println("Integer: " + integer);

        Long l2 = Long.valueOf(800000000000l);
        System.out.println("Long: " + l2);

        Float f = Float.valueOf(80.500f);
        System.out.println("Float: " + f);

        Double d = Double.valueOf(8888.50d);
        System.out.println("Double: " + d);

        Boolean bool2 = Boolean.valueOf(true);
        System.out.println("Boolean: " + bool2);

        Character character = Character.valueOf('G');
        System.out.println("Character: " + character);

        System.out.println("--------------------");

        int primitivo = 80;
        List<Integer> idades = new ArrayList<>();
        idades.add(10); // autoboxin
        idades.add(Integer.valueOf(20));
        idades.add(primitivo);
        System.out.println(idades);

    }
}
