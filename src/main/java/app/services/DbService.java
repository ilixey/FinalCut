package app.services;

import app.DatabaseHandler;
import app.entities.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbService {

    private Connection connection = DatabaseHandler.makeConnection();

    public void addUser(User user) throws SQLException {
        String request = "INSERT INTO users (name, surname, age) VALUES (" + user.getName() + "," + user.getSurname() + "," + user.getAge() + ");";
        PreparedStatement preparedStatement = connection.prepareStatement(request);
    }
}
