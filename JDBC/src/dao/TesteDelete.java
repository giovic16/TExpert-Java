package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class TesteDelete {
    public static void main(String[] args) throws SQLException {
        CarroDAO dao = new CarroDAO();
        dao.delete(1);

        dao.listagem().forEach(carro -> System.out.println(carro));
    }
}
