package transaction;

import crud.FactoryConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TesteTransaction {
    public static void main(String[] args) throws SQLException {
        Connection connection = FactoryConnection.criaConexao();
        connection.setAutoCommit(false);

        String sql = "update modelos set cor_id = ? where id = ?";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, 2);
        st.setInt(2, 10);
        st.execute();
        System.out.println("Carro 1 alterado com sucesso!");

        int idCarro = 3;
        String sql2 = "update modelos set cor_id = ? where id = ?";
        PreparedStatement st2 = connection.prepareStatement(sql2);
        st2.setInt(1, 2);
        st2.setInt(2, idCarro);

        if (idCarro == 3) {
            System.out.println("Rollback");
        }else {
            st2.execute();
            System.out.println("Carro 2 alterado com sucesso!");

            connection.commit();
            System.out.println("Commit");
        }

        st.close();
        st2.close();
        connection.close();
    }
}
