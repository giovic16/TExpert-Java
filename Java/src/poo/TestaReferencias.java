package poo;

public class TestaReferencias {
    public static void main(String[] args) {

        // tempo de compilação x tempo de execução
        Cachorro cachorro = new Cachorro(); // compila todas os métodos
//        Animal cachorro = new Cachorro(); // compila os métodos anda, come e respira
//        SerVivo cachorro = new Cachorro(); // compila o método respira

        cachorro.anda();
        cachorro.come();
        cachorro.fazBarulho();
        cachorro.respira();
        cachorro.latir();

        Animal gato = new Gato();
        gato.anda();
        gato.come();
    }
}
