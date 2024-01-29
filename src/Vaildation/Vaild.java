/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vaildation;

/**
 *
 * @author devku
 */
public class Vaild {

    public boolean validate(String userName, String email, String password, String phoneNumber, String mode) {
        boolean isValid = true;

        // Validate user name
        if (userName == null || userName.isEmpty()) {
            isValid = false;
        }

        // Validate email
        if (email == null || email.isEmpty() || !email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            isValid = false;
        }

        // Validate password
        if (password == null || password.isEmpty() || password.length() < 8) {
            isValid = false;
        }

        // Validate phone number
        if (phoneNumber == null || phoneNumber.isEmpty() || !phoneNumber.matches("\\d{10}")) {
            isValid = false;
        }

        // Validate mode
        if (mode == null || mode.isEmpty() || (!mode.equalsIgnoreCase("online") && !mode.equalsIgnoreCase("offline"))) {
            isValid = false;
        }

        return isValid;
    }
}
