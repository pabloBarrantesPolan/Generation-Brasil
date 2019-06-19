package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection(){

        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3307/restaurante?serverTimezone=GMT-3","root","");

        }catch (SQLException e){
            throw new  RuntimeException(e);
        }

    }

}
