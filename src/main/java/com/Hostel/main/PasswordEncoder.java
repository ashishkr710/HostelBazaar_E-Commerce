package com.Hostel.main;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
    public static void main(String[] args) {
        String password = "admin"; // Replace with your actual password
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(password);
        System.out.println(encodedPassword);


    }
}
