package dao;

import java.sql.SQLException;

public class TesteInsert {
    public static void main(String[] args) throws SQLException {

        Carro carro = new Carro("Focus", "Ford", 1, 2019);

        CarroDAO dao = new CarroDAO();
        dao.insert(carro);



    }
}
