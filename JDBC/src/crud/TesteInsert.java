package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TesteInsert {
    public static void main(String[] args) throws SQLException {
        Connection connection = FactoryConnection.criaConexao(); // pega a conexao da classe FactoryConnection
        System.out.println("Banco de dados conectado");

        int id = 7;
        String modelo = "Compass";
        String marca = "Jeep";
        int corId = 5;
        int ano = 2020;

        String sql = "insert into modelos (id, modelo, marca, cor_id, ano) values (?,?,?,?,?)";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, id);
        st.setString(2, modelo);
        st.setString(3, marca);
        st.setInt(4, corId);
        st.setInt(5, ano);
        st.execute();
        System.out.println("Carro: " + modelo + " adicionado com sucesso");

        st.close();
        connection.close();
    }
}
