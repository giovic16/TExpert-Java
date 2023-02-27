package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TesteLike {
    public static void main(String[] args) throws SQLException {
        Connection connection = FactoryConnection.criaConexao();

        String sql = "select * from modelos where modelo like ?";
        PreparedStatement st = connection.prepareStatement(sql);
//        st.setString(1, "C%"); // programa que imprime todos os carros que inicia com a letra C
//        st.setString(1, "%us"); // programa que imprime todos os carros que terminam com us
        st.setString(1, "%s"); // programa que imprime todos os carros que terminam com a letra S
        ResultSet rs = st.executeQuery();

        List<Carro> carros = new ArrayList<>();
        while (rs.next()){
            Carro carro = new Carro(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getInt(4),
                    rs.getInt(5)
            );
            carros.add(carro);
        }
        carros.forEach(carro -> System.out.println(carro));
    }
}
