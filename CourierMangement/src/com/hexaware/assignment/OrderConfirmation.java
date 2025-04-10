package com.hexaware.assignment;

public class OrderConfirmation {

    public static String generateOrderEmail(String customerName, String orderNumber, String deliveryAddress, String deliveryDate) {
        return "Hello " + customerName + ",\n\n" +
                "Thank you for your order. Your order number is " + orderNumber + ".\n" +
                "The delivery address is:\n" + deliveryAddress + "\n\n" +
                "Your order is expected to be delivered on: " + deliveryDate + "\n\n" +
                "Best regards,\n" +
                "Courier System";
    }

    public static void main(String[] args) {
        String email = generateOrderEmail("John Doe", "ORD12345", "123 Main St, New York, NY", "2025-04-20");
        System.out.println(email);
    }
}

