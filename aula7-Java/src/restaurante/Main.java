package restaurante;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/restaurante");
            System.out.println("conectou!");

            conexao.close();
        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
