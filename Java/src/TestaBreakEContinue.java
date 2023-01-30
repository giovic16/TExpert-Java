public class TestaBreakEContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
//            if (i == 6) {
//                break; // para a contagem no 6
//            }

            if (i == 6) {
                continue; // pula o 6
            }
            System.out.println(i);
        }
        System.out.println("Finalizou o FOR");
    }
}
