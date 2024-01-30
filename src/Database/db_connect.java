package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class db_connect {
    private static final String url = "jdbc:mysql://localhost:3306/";
    private static final String databaseName = "loginform";
    private static final String username = "root";
    private static final String password = "";

    public static void main(String[] args) {
        db_connect connect = new db_connect();
        connect.createDatabase();
        connect.updateDatabase();
        connect.insertUser("example@email.com", "securepassword");
        connect.login("example@email.com", "securepassword");
    }

    public boolean login(String userEmail, String userPassword) {

        try (Connection con = DriverManager.getConnection(url + databaseName, username, password)) {
            System.out.println("Connected to database for login");
            
            PreparedStatement selectStatement = con.prepareStatement("SELECT * FROM users WHERE Email = ?");
            selectStatement.setString(1, userEmail);

            ResultSet resultSet = selectStatement.executeQuery();

            if (resultSet.next()) {
                if (userPassword.equals(resultSet.getString("Password"))) {
                    System.out.println("Login successful");
                    return true;
                } else {
                    System.out.println("Login failed: Invalid password");
                    return false;
                }
            } else {
                System.out.println("Login failed: User not found");
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error during login: " + e.getMessage());
            return false;
        }
    }

    public void createDatabase() {
        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = con.prepareStatement("CREATE DATABASE IF NOT EXISTS " + databaseName)) {
            statement.executeUpdate();
            System.out.println("Database created: " + databaseName);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error creating database: " + e.getMessage());
        }
    }

    public void insertUser(String userEmail, String userPassword) {

        try (Connection con = DriverManager.getConnection(url + databaseName, username, password);
             PreparedStatement insertStatement = con.prepareStatement("INSERT INTO users (Email, Password) VALUES (?, ?)")) {
            insertStatement.setString(1, userEmail);
            insertStatement.setString(2, userPassword);
            insertStatement.executeUpdate();
            System.out.println("User added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error inserting user: " + e.getMessage());
        }
    }


    public void updateDatabase() {
        try (Connection con = DriverManager.getConnection(url + databaseName, username, password);
             PreparedStatement createStatement = con.prepareStatement(
                     "CREATE TABLE IF NOT EXISTS users (Email VARCHAR(255), Password VARCHAR(255))")) {
            createStatement.executeUpdate();
            System.out.println("Table 'users' created!");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error updating database: " + e.getMessage());
        }
    }

   
}
