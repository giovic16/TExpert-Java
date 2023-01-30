public class TestaCondicional {
    public static void main(String[] args) {
        double preco = 1;

        if (preco >= 20) {
            System.out.println("Condição 1");
            System.out.println("Produto com desconto de 10%");

        }else if (preco >= 10){
            System.out.println("Condição 2");
            System.out.println("Produto com desconto de 5%");
        }else {
            System.out.println("Condição 3");
            System.out.println("Produto sem desconto");
        }

    }
}
