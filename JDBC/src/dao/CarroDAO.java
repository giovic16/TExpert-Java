package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarroDAO {

    public List<Carro> listagem() throws SQLException {
        Connection connection = FactoryConnection.criaConexao(); // pega a conexao da classe FactoryConnection
        System.out.println("Banco de dados conectado!");

        String sql = "select id, modelo, marca, cor_id, ano from modelos"; // seleciona tabela
        PreparedStatement st = connection.prepareStatement(sql);
        ResultSet rs = st.executeQuery(); // recolhe os dados da tabela

        List<Carro> carros = new ArrayList<>();

        while (rs.next()) {
            // pega os dados da tabela
            Carro carro = new Carro(rs.getInt(1), // pega os dados do carro
                    rs.getString(2),
                    rs.getString(3),
                    rs.getInt(4),
                    rs.getInt(5));
            carros.add(carro);
        }
        rs.close();
        st.close();
        connection.close();
        return carros;
    }

    public void insert(Carro carro) throws SQLException {
        Connection connection = crud.FactoryConnection.criaConexao(); // pega a conexao da classe FactoryConnection

        String sql = "insert into modelos (modelo, marca, cor_id, ano) values (?,?,?,?)";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setString(1, carro.getModelo());
        st.setString(2, carro.getMarca());
        st.setInt(3, carro.getCorId());
        st.setInt(4, carro.getAno());

        st.execute();
        System.out.println("Carro: " + carro.getModelo() + " adicionado com sucesso");

        st.close();
        connection.close();
    }

    public void update(Carro carro) throws SQLException {
        Connection connection = FactoryConnection.criaConexao(); // pega a conexao da classe FactoryConnection
        String sql = "update modelos set modelo = ?, marca = ?, cor_id = ?, ano = ? where id = ?";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setString(1, carro.getModelo());
        st.setString(2, carro.getMarca());
        st.setInt(3, carro.getCorId());
        st.setInt(4, carro.getAno());
        st.setInt(5, carro.getId());
        st.execute();

        System.out.println("Carro alterado com sucesso");

        st.close();
        connection.close();
    }

    public Carro buscaPor(int id) throws SQLException {
        Carro carro = null;

        Connection connection = FactoryConnection.criaConexao();
        String sql = "select * from modelos where id = ?";

        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, id);
        ResultSet rs = st.executeQuery();

        if(rs.next()) {
            carro = new Carro(
                rs.getInt("id"),
                rs.getString("modelo"),
                rs.getString("marca"),
                rs.getInt("cor_id"),
                rs.getInt("ano")
            );
        }
        st.close();
        rs.close();
        connection.close();
        return carro;
    }


    public void delete(int id) throws SQLException {
        Connection connection = crud.FactoryConnection.criaConexao(); // pega a conexao da classe FactoryConnection

        String sql = "delete from modelos where id = ?";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, id);
        st.execute();

        System.out.println("Carro de id " + id + " deletado com sucesso");

        st.close();
        connection.close();
    }
}
