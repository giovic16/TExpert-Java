package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Padrão em java para classes que criam objetos complexos: Factory
public class FactoryConnection {

    public static Connection criaConexao() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/carros","root","19421970"); // gera conexao que putras classes podem consumir
    }
}
