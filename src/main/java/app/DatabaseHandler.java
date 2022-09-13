package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHandler {

    private static final String url = "jdbc:postgresql://localhost:5432/testDb";
    private static final String login = "postgres";
    private static final String password = "root";

    static {
        try{
            Class.forName("org.postgresql.Driver");
        }
        catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }

    public static Connection makeConnection(){
        try {
            return DriverManager.getConnection(url, login, password);
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

}
