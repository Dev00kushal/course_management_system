package course.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
}


    public boolean login(String userEmail, String userPassword) {
        try (Connection con = DriverManager.getConnection(url + databaseName, username, password)) {
       
            PreparedStatement selectStatement = con.prepareStatement("SELECT * FROM users WHERE Email = ? AND Password = ?");
            selectStatement.setString(1, userEmail);
            selectStatement.setString(2, userPassword);

            ResultSet resultSet = selectStatement.executeQuery();

            // Check if a matching user is found
            if (resultSet.next()) {
                System.out.println("Login successful");
                return true;
            } else {
                System.out.println("Invalid email or password");
                return false;
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

public void createDatabase() {
    try (Connection con = DriverManager.getConnection(url, username, password);
         PreparedStatement statement = con.prepareStatement("CREATE DATABASE IF NOT EXISTS " + databaseName)) {
        statement.executeUpdate();
        System.out.println("Database created: " + databaseName);
    } catch (SQLException e) {
        System.out.println("Error: " + e.getMessage());
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
        System.out.println("Error inserting user: " + e.getMessage());
    }
}

public void updateDatabase() {
    try (Connection con = DriverManager.getConnection(url + databaseName, username, password);
         PreparedStatement createStatement = con.prepareStatement(
                 "CREATE TABLE users (Email VARCHAR(255), Password VARCHAR(255))")) {
        createStatement.executeUpdate();
        System.out.println("Table 'users' created!");

    } catch (SQLException e) {
        System.out.println("Error updating database: " + e.getMessage());
    }
}




    public void closeResources(Connection con, Statement st, ResultSet rs) {
        try {
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
