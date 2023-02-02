package poo;

public class TestaAnimal1 {
    public static void main(String[] args) {
        Animal animal = new Animal();

        try {
            animal.setTamanho(-10);
        }catch (TamanhoInvalidoException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("FINALLY");
        }

//        System.out.println(animal.getTamanho());
    }
}
