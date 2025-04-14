package com.hexaware.assignment;

public class CustomerDataValidation {

    public static boolean validateData(String data, String detail) {
        if (detail.equalsIgnoreCase("name")) {
            return data.matches("^[A-Z][a-z]*$"); 
        } else if (detail.equalsIgnoreCase("address")) {
            return !data.matches(".*[!@#$%^&*()?\":{}|<>].*"); 
        } else if (detail.equalsIgnoreCase("phone")) {
            return data.matches("\\d{3}-\\d{3}-\\d{4}");
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(validateData("John", "name"));  
        System.out.println(validateData("123 Main St&", "address"));  
        System.out.println(validateData("123-456-7890", "phone"));  
    }
}

