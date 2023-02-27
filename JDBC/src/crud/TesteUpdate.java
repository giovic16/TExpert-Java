package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TesteUpdate {
    public static void main(String[] args) throws SQLException {
        Connection connection = FactoryConnection.criaConexao(); // pega a conexao da classe FactoryConnection
        String sql = "update modelos set ano = ? where id = ?";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, 2023);
        st.setInt(2, 6);
        st.execute();

        System.out.println("Carro alterado com sucesso");

        st.close();
        connection.close();
    }
}
