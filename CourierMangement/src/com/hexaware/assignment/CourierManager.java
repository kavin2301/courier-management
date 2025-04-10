package com.hexaware.assignment;

import java.util.*;

public class CourierManager {

    // Method to find the nearest available courier (first with status "Available")
    public static Courier findNearestAvailableCourier(List<Courier> couriers) {
        for (Courier c : couriers) {
            if (c.status.equalsIgnoreCase("Available")) {
                return c;
            }
        }
        return null; // No available courier found
    }

    public static void main(String[] args) {
        // Sample list of couriers
        List<Courier> couriers = new ArrayList<>(); 
        couriers.add(new Courier(101, 1, 5, "Laptop", "Busy"));
        couriers.add(new Courier(102, 2, 6, "Phone", "Available"));
        couriers.add(new Courier(103, 3, 7, "Documents", "Busy"));
        couriers.add(new Courier(104, 4, 8, "Clothes", "Available"));

        // Finding nearest available courier
        Courier nearest = findNearestAvailableCourier(couriers);

        if (nearest != null) {
            System.out.println("Nearest available courier found:");
            System.out.println("Courier ID: " + nearest.courierId);
            System.out.println("Sender ID: " + nearest.senderId);
            System.out.println("Receiver ID: " + nearest.receiverId);
            System.out.println("Package: " + nearest.packageName);
            System.out.println("Status: " + nearest.status);
        } else {
            System.out.println("No available courier found.");
        }
    }
}
