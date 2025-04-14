package com.hexaware.assignment;

import java.security.SecureRandom;

public class PasswordGenerator {

    private static final String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String lowercase = "abcdefghijklmnopqrstuvwxyz";
    private static final String digit = "0123456789";
    private static final String special = "!@#$%^&*()-_+=<>?";

    public static String generatePassword(int length) {
        String allChars = uppercase + lowercase + digit + special;
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allChars.length());
            password.append(allChars.charAt(index));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        String password = generatePassword(12);
        System.out.println("Generated Password: " + password);
    }
}

