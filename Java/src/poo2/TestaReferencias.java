package poo2;

public class TestaReferencias {
    public static void main(String[] args) {

//         int i = 25;
//         System.out.println(i); // 25
//
//         ClasseFilha2 classeFilha2 = new ClasseFilha2();
//         classeFilha2.m1(i); // 26
//         System.out.println(i); // 25

           ClasseFilha2 classeFilha2 = new ClasseFilha2();
           System.out.println(classeFilha2.i); // 15

           ClasseMae2 classeMae2 = new ClasseMae2();
           classeFilha2.m1(classeFilha2); // 16

           System.out.println(classeFilha2.i); // 16

    }
}
