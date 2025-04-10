package com.hexaware.assignment;
import java.util.Scanner;
public class UserAuthentication {

	public static void main(String[] args) {
		String storedUsername = "employee123";
        String storedPassword = "password123";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        if (inputUsername.equals(storedUsername) && inputPassword.equals(storedPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();

	}

}
