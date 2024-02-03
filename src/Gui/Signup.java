import javax.swing.*;
import java.awt.*;

public class Signup extends JFrame {

    public Signup() {
        super("FAUGET");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 500);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Add logo
        JLabel logoLabel = new JLabel("FAUGET");
        logoLabel.setFont(new Font("Arial", Font.BOLD, 24));
        logoLabel.setForeground(Color.BLUE); // Set logo color to blue
        panel.add(logoLabel, BorderLayout.NORTH);

        // Add title
        JLabel titleLabel = new JLabel("Create an account");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setForeground(Color.WHITE); // Set title color to white
        panel.add(titleLabel, BorderLayout.NORTH);

        // Add subtitle
        JLabel subtitleLabel = new JLabel("Let's get started!");
        subtitleLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        subtitleLabel.setForeground(Color.GRAY); // Set subtitle color to gray
        panel.add(subtitleLabel, BorderLayout.NORTH);

        // Add name field
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setForeground(Color.WHITE); // Set label color to white
        JTextField nameField = new JTextField(20);
        panel.add(nameLabel);
        panel.add(nameField);

        // Add email field
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setForeground(Color.WHITE); // Set label color to white
        JTextField emailField = new JTextField(20);
        panel.add(emailLabel);
        panel.add(emailField);

        // Add password field
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setForeground(Color.WHITE); // Set label color to white
        JPasswordField passwordField = new JPasswordField(20);
        panel.add(passwordLabel);
        panel.add(passwordField);

        // Add sign up button
        JButton signUpButton = new JButton("Sign up");
        signUpButton.setBackground(Color.BLUE); // Set button background color to blue
        signUpButton.setForeground(Color.WHITE); // Set button text color to white
        signUpButton.addActionListener(e -> {
            // Handle sign up button click
            String name = nameField.getText();
            String email = emailField.getText();
            String password = passwordField.getText();
            // ... (validate and process data)
        });
        panel.add(signUpButton);

        // Add continue with email button
        JButton continueWithEmailButton = new JButton("Continue with email");
        continueWithEmailButton.setBackground(Color.BLUE); // Set button background color to blue
        continueWithEmailButton.setForeground(Color.WHITE); // Set button text color to white
        continueWithEmailButton.addActionListener(e -> {
            // Handle continue with email button click
            String email = emailField.getText();
            // ... (send verification email and proceed)
        });
        panel.add(continueWithEmailButton);

        // Add login link
        JLabel loginLabel = new JLabel("Already have an account?");
        loginLabel.setForeground(Color.WHITE); // Set label color to white
        JButton loginButton = new JButton("Log in");
        loginButton.setBackground(Color.BLUE); // Set button background color to blue
        loginButton.setForeground(Color.WHITE); // Set button text color to white
        loginButton.addActionListener(e -> {
            // Handle login button click
            // ... (open login page)
        });
        panel.add(loginLabel);
        panel.add(loginButton);

        panel.setBackground(Color.BLACK); // Set panel background color to black
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Signup();
    }
}