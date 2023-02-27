package dao;

import java.sql.SQLException;
import java.util.List;

public class TesteSelect {
    public static void main(String[] args) throws SQLException {
        List<Carro> carros = new CarroDAO().listagem();
        carros.forEach(carro -> System.out.println(carro)); // imprime os dados do carro selecionados no toString da classe Carro
    }
}
