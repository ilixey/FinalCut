package app.services;

import app.DatabaseHandler;
import app.entities.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbService {

    private Connection connection = DatabaseHandler.makeConnection();

    public void addUser(User user) throws SQLException {
        String request = "INSERT INTO test.users (name, surname, age) VALUES (?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(request);
        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, user.getSurname());
        preparedStatement.setInt(3, user.getAge());
        preparedStatement.execute();
        preparedStatement.close();
    }
}
