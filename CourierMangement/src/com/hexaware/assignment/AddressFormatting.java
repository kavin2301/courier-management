package com.hexaware.assignment;

public class AddressFormatting {

    public static String formatAddress(String address) {
        String[] words = address.split(" ");
        StringBuilder formattedAddress = new StringBuilder();

        for (String word : words) {
            formattedAddress.append(Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase()).append(" ");
        }

        return formattedAddress.toString().trim();
    }

    public static String formatZipCode(String zipCode) {
        return zipCode.replaceAll("[^0-9]", ""); // Remove non-numeric characters
    }

    public static void main(String[] args) {
        String address = "123 main st, new york, ny 10001";
        System.out.println("Formatted Address: " + formatAddress(address));
        System.out.println("Formatted Zip Code: " + formatZipCode("1000A1"));
    }
}
