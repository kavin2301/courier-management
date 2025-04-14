package com.hexaware.assignment;
import java.util.*;
public class CustomerOrders {
	public static void main(String[] args) {
        List<Courier> couriers = List.of(
            new Courier(11, 2, 6, "Headphones", "Delivered"),
            new Courier(12, 3, 9, "Laptop Charger", "Processing"),
            new Courier(13, 5, 1, "Books", "Delivered"),
            new Courier(14, 2, 10, "Smartphone", "Cancelled"),
            new Courier(15, 2, 4, "Winter Jacket", "Processing")
        );

        int specificCustomerId = 2; 

        System.out.println("Orders placed by Customer ID: " + specificCustomerId);
        for (Courier c : couriers) {
            if (c.senderId == specificCustomerId) {
                System.out.println("Courier ID: " + c.courierId + " | Package: " + c.packageName + " | Status: " + c.status);
            }
        }
    }

}
