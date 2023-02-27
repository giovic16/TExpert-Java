package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TesteWhere {
    public static void main(String[] args) throws SQLException {
        Connection connection = FactoryConnection.criaConexao();
        String sql = "select * from modelos where ano  > ?"; // consigo colocar o ano no lugar da interrogação ou setar igual na inha 15
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, 2018);
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
