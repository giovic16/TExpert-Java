package crud;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TesteSelect {
    public static void main(String[] args) throws SQLException {
        Connection connection = FactoryConnection.criaConexao(); // pega a conexao da classe FactoryConnection
        System.out.println("Banco de dados conectado!");

        String sql = "select * from modelos"; // seleciona tabela
        PreparedStatement st = connection.prepareStatement(sql);
        ResultSet rs = st.executeQuery(); // recolhe os dados da tabela

        List<Carro> carros = new ArrayList<>();

        while (rs.next()) {
            // pega os dados da tabela
            Carro carro = new Carro(rs.getInt("id"), // pega os dados do carro
                                    rs.getString("modelo"),
                                    rs.getString("marca"),
                                    rs.getInt("cor_id"),
                                    rs.getInt("ano"));
            carros.add(carro);
        }
        carros.forEach(carro -> System.out.println(carro)); // imprime os dados do carro selecionados no toString da classe Carro

        rs.close();
        st.close();
        connection.close();
    }
}
