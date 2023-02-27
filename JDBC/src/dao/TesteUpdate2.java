package dao;

import java.sql.SQLException;

public class TesteUpdate2 {
    public static void main(String[] args) throws SQLException {

        CarroDAO dao = new CarroDAO();
        Carro carro = dao.buscaPor(4);

        System.out.println(carro);

        carro.setCorId(5);
        carro.setAno(2025);

        dao.update(carro);

        Carro carroAlterado = dao.buscaPor(4);
        System.out.println(carroAlterado);
    }
}
