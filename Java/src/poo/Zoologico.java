package poo;

public class Zoologico {
    public Animal[] animais = new Animal[15];
    public void alimenta(Animal animal) {
        animal.come();
    }

    public void barulho(Barulhento animal) {
        animal.fazBarulho();
    }

}
