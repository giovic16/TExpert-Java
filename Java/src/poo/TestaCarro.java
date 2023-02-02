package poo;

public class TestaCarro {
    public static void main(String[] args) {

//        Object carro1 = new Carro();
//        Veiculo carro2 = new Carro();
//        Carro carro3 = new Carro();

//        carro1.toString();
//
//        carro2.acelera();
//        carro2.toString();
//
//        carro3.trocarMarcha();
//        carro3.acelera();
//        carro3.toString();


        Carro carro = new Carro();
        carro.setModelo("Focus");
        carro.setMarca("Ford");
        System.out.println(carro.toString()); // toString() retorna pacote (poo) + classe (Carro) + hashcode (código de memória)


    }
}
