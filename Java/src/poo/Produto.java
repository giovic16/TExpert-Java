package poo;

public class Produto {
    // caracteristicas (Dados)
    String nome, marca; // atributos
    double preco; // atributos
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
