package Users;

import Exception.InvalidCredintial;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Exception.NullException;

public class Student extends User implements Activity {

public Student(){
    
}
    // parameter
    public Student(int id, String name, String email) {
    super(id,name,email);
    }

    // students
    public void studentRegister(String s_name, int c_id, String s_email, String s_pass, int lvl) {
        String insert = "INSERT INTO students (student_name, course_id, student_email, student_password, level) VALUES(?,?,?,?,?) ";

        try {
            PreparedStatement state = connect.prepareStatement(insert);
            state.setString(1, s_name);
            state.setString(2, String.valueOf(c_id));
            state.setString(3, s_email);
            state.setString(4, s_pass);
            state.setString(5, String.valueOf(lvl));
            state.executeUpdate();
            JOptionPane.showMessageDialog(null, "Account created successfully");
            state.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Unable To Register!!!");
            System.out.println(e);
        }
    }

    public ArrayList<Student> getStudents() {
        String query = "SELECT * FROM students";
        ArrayList<Student> students = new ArrayList<Student>();
        try {
            PreparedStatement state = connect.prepareStatement(query);
            ResultSet set = state.executeQuery(query);
            while (set.next()) {
                students.add(new Student(set.getInt("student_id"), set.getString("student_name"),
                        set.getString("student_email")));

            }
            state.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
        return students;
    }

    public ArrayList<String> getStudentsData(String email) {
        String query = "SELECT * FROM students WHERE email = ?";
        ArrayList<String> students = new ArrayList<String>();
        try {
            PreparedStatement state = connect.prepareStatement(query);
            state.setString(1, String.valueOf(email));
            ResultSet set = state.executeQuery();
            while (set.next()) {
                students.add(set.getString("student_name"));
                students.add(set.getString("level"));

            }
            state.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
        return students;
    }

    public void changePassword(String email, String oldPassword, String newPassword) {
        try {
            // Verify the old password first
            PreparedStatement stmt = connect
                    .prepareStatement("SELECT student_password FROM students WHERE student_email = ?");
            stmt.setString(1, email);
            ResultSet result = stmt.executeQuery();
            if (!result.next() || !result.getString("student_password").equals(oldPassword)) {
                JOptionPane.showMessageDialog(null, "Incorrect old password!");
                return;
            }

            // Update the password if the old password is correct
            stmt = connect.prepareStatement("UPDATE students SET student_password = ? WHERE student_email = ?");
            stmt.setString(1, newPassword);
            stmt.setString(2, email);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Password changed successfully!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Something went wrong!", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    public boolean login(String email, String password, String name) {
    Connection connect = db.load();

    Statement stmt;
    ResultSet rs;
    if (email.isEmpty() || password.isEmpty() || name.isEmpty()) {
        throw new NullException();
    }
    try {
        stmt = connect.createStatement();
        rs = stmt.executeQuery(
                "SELECT student_name, student_password FROM students WHERE student_email='" + email + "'");
        if (rs.next()) {
            // Get the password and name from the database
            String passwordFromDB = rs.getString("student_password");
            String nameFromDB = rs.getString("student_name");

            // Compare the password and name from the database with the entered ones
            if (passwordFromDB.equals(password) && nameFromDB.equals(name)) {
                JOptionPane.showMessageDialog(null, "Login successful!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect email, password, or name!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect email or password!");
        }
        connect.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Something went wrong!",
                "Error", JOptionPane.ERROR_MESSAGE);
    }
    return false;
}


    public ArrayList<String> moduleEnrollment(String email) {
        String query = "SELECT students.student_id, students.student_name, modules.module_id, modules.module_name FROM students JOIN enrollments ON students.student_id = enrollments.student_id JOIN modules ON enrollments.module_id = modules.module_id WHERE students.student_email = ?";
        ArrayList<String> students = new ArrayList<String>();
        try {
            PreparedStatement state = connect.prepareStatement(query);
            state.setString(1, String.valueOf(email));
            ResultSet set = state.executeQuery();
            while (set.next()) {
                students.add(set.getString("module_name"));
            }

            state.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Something went wrong!",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        return students;
    }

    @Override
    public boolean login(String email, String password) throws InvalidCredintial, Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  

}
