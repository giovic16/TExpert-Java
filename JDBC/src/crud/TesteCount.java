package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TesteCount {
    public static void main(String[] args) throws SQLException {
        Connection connection = FactoryConnection.criaConexao();

        String sql = "select count(*) as total from modelos";

        PreparedStatement st = connection.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        rs.next();

        int total  = rs.getInt("total");
        System.out.println("Total de carros: " + total);

        rs.close();
        st.close();
        connection.close();
    }
}
