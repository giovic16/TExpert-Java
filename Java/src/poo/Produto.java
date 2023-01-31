package poo;

public class Produto {
    // caracteristicas (Dados)
    // Atributos
    String nome, marca;
    double preco;
    // comportamentos
    void formataPreco(){
        System.out.println("R$ " + preco);
    }
    void valida() {
        if (nome != ""){
            System.out.println("Nome inválido!");
        }
    }
}
