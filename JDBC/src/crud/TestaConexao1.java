package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao1 {
    public static void main(String[] args) throws SQLException {
        Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/carros","root","password");

        System.out.println("Banco de dados conectado");
        conexao.close();
    }
}
