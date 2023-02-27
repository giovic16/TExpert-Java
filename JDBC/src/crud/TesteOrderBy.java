package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TesteOrderBy {
    public static void main(String[] args) throws SQLException {
        Connection connection = FactoryConnection.criaConexao();
        String sql = "select * from modelos order by ano desc";
        PreparedStatement st = connection.prepareStatement(sql);
        ResultSet rs = st.executeQuery();

        List<Carro> carros = new ArrayList<>();
        while (rs.next()){
            Carro carro = new Carro(
                    rs.getInt("id"), // pega os dados do carro
                    rs.getString("modelo"),
                    rs.getString("marca"),
                    rs.getInt("cor_id"),
                    rs.getInt("ano"));
            carros.add(carro);
        }
        carros.forEach(carro -> System.out.println(carro));

        st.close();
        rs.close();
        connection.close();

    }
}
