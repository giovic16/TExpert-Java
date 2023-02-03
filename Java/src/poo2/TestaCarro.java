package poo2;

public class TestaCarro {
    public static void main(String[] args) {

        // Types: Classes, Interface e Enum

        Carro carro = new Carro(Modelos.X6,Marcas.BMW,Cores.AZUL);
        System.out.println(carro);

//        Cores[] tamanhoCores = Cores.values();
//        System.out.println("Tamanho Enum Cores: " + tamanhoCores.length);
//        for(Cores cor : tamanhoCores){
//            System.out.println(cor.getDescricao());
//        }
//
//        Cores cor = Cores.valueOf("AZUL");
//        System.out.println(cor);
    }
}
