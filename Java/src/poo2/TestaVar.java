package poo2;

import java.util.Arrays;

public class TestaVar {
    public static void main(String[] args) {


        // var não aceita null
        // var x = null;

        // var é somente para variáveis locais
        // private var sobrenome;


        var i = 10; // i não consegue chamar getClass pq primitivo não tem instância
        var nome = "Giovana";
        nome = "Victoria";
        var filha = new ClasseFilha();
        var numeros = Arrays.asList(10, 20, 30);

        System.out.println(nome.getClass());
        System.out.println(filha.getClass());
        System.out.println(numeros.getClass());

        if (filha instanceof ClasseFilha){
            System.out.println(true);
        }
    }
}
