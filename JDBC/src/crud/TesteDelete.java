package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TesteDelete {
    public static void main(String[] args) throws SQLException {
        Connection connection = FactoryConnection.criaConexao(); // pega a conexao da classe FactoryConnection

        int id = 3;

        String sql = "delete from modelos where id = ?";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, id);
        st.execute();

        System.out.println("Carro de id: " + id + " deletado com sucesso");

        st.close();
        connection.close();
    }
}
