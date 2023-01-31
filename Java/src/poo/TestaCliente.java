package poo;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();

        cliente1.nome = new String("Giovana");
        cliente1.cpf = 123;
        cliente1.produto = new Produto();
        System.out.println(cliente1.nome + " - " + cliente1.cpf + " - " + cliente1.produto); // produto está vazio, então retornará o endereço de memória


        Produto produto1 = new Produto();
//        produto1.nome = "Mesa";
//        produto1.marca = "X";
//        produto1.preco = 1000;

        cliente1.produto = produto1;
//        System.out.println(cliente1.produto.nome + " - " + cliente1.produto.marca + " - " + cliente1.produto.preco); // nome, marca e preço do produto do cliente

    }
}
