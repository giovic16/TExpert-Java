public class TestaEscopo {
    public static void main(String[] args) {
        double preco;
        preco = 20;

        if(preco >= 10){
            System.out.println("Desconto de 10%");

            int i = 10;
            System.out.println("i:" + i);
        }else {
            // i dentro do escopo do if, não funciona no else
           // System.out.println("i:" + i);

            System.out.println("Produto sem desconto");
        }
    }
}
