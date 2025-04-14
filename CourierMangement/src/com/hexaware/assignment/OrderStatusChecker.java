package com.hexaware.assignment;

public class OrderStatusChecker {

	public static void main(String[] args) {
		String status = "Delivered"; 

        if (status.equalsIgnoreCase("Delivered")) {
            System.out.println("The order has been delivered.");
        } else if (status.equalsIgnoreCase("Processing")) {
            System.out.println("The order is still processing.");
        } else if (status.equalsIgnoreCase("Cancelled")) {
            System.out.println("The order was cancelled.");
        } else {
            System.out.println("Unknown order status.");
        }
	}

}
