package course.management.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class db_connect {
    private static final String url = "jdbc:mysql://localhost:3306/";
    private static final String databaseName = "LoginForm";
    private static final String username = "root";
    private static final String password = "";

    public static void main(String[] args) {
        db_connect connect = new db_connect();
        connect.createDatabase();
        connect.updateDatabase();
        connect.Login(args, null);
    }

    public void Login(String[] args, String password) {
        try (Connection con = DriverManager.getConnection(url + databaseName, username, password)) {
            PreparedStatement insertStatement = con.prepareStatement("INSERT INTO users (Email, Password) VALUES (?, ?)");

            for (String usernameLoop : args) {
                insertStatement.setString(1, usernameLoop);
                insertStatement.setString(2, password);
                insertStatement.executeUpdate();
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        throw new UnsupportedOperationException("Unimplemented method 'Login'");
    }

    public void createDatabase() {
        try (Connection con = DriverManager.getConnection(url, username, password);
             Statement statement = con.createStatement()) {
            String createDatabaseQuery = "CREATE DATABASE IF NOT EXISTS " + databaseName;
            statement.executeUpdate(createDatabaseQuery);
            System.out.println("Database created!");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void updateDatabase() {
        try (Connection con = DriverManager.getConnection(url + databaseName, username, password);
             Statement statement = con.createStatement()) {
            String createTableQuery = "CREATE TABLE IF NOT EXISTS users (Email VARCHAR(255), Password VARCHAR(255))";
            statement.executeUpdate(createTableQuery);
            System.out.println("Database updated!");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void closeResources(Connection con, Statement st, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

 
}