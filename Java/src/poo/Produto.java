package poo;

public class Produto {
    // private e public - modificadores de acesso

    // caracteristicas (Dados)
    // Atributos
    private String nome, marca;
    private double preco;

    // Acessos através de metodos public - getter e setter
    // Metodos public expõe interfaces do objeto
    public void setPreco(double preco){
        this.preco = preco;
    }

    public String getPreco(){
        return "R$ " + this.preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

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
