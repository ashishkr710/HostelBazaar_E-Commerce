package com.Hostel.main;
//This file is for creating BCryptPassword for testing the application.
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
    public static void main(String[] args) {
        String password = "123456"; // Replace with your actual password
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(password);
        System.out.println(encodedPassword);
    }
}
