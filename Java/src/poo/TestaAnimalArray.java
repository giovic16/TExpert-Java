package poo;

public class TestaAnimalArray {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();

        Animal cachorro = new Animal();
        cachorro.setNome("Fred");

        Animal gato = new Animal();
        gato.setNome("Venom");

        zoo.animais[0] = cachorro;
        zoo.animais[1] = gato;

        System.out.println(zoo.animais);
        System.out.println("Tamanho do zoo: " + zoo.animais.length);

        for (Animal animal : zoo.animais){
            System.out.println(animal.getNome());
            break;
        }
    }
}
