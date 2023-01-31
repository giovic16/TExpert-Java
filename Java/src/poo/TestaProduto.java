package poo;

public class TestaProduto {
    public static void main(String[] args) {
        // variável produto1 do tipo Produto
        Produto produto1 = new Produto(); // objeto criado

//        produto1.marca = "X";
//        produto1.nome = "Mesa";
//        produto1.preco = 125.5;

        produto1.formataPreco(); // objeto utilizado
        System.out.println(produto1); // retorna um endereço de memória

        Produto produto2 = new Produto();
//        produto2.marca = "Y";
//        produto2.nome = "Celular";
//        produto2.preco = 1500;

        produto2.formataPreco();
        System.out.println(produto2);

    }
}
