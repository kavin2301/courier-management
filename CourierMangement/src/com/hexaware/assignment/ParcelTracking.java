package com.hexaware.assignment;

import java.util.Scanner;

public class ParcelTracking {
    public static void main(String[] args) {
        // Initialize the 2D array with parcel tracking numbers and their status
        String[][] parcels = {
            {"12345", "In Transit"},
            {"67890", "Out for Delivery"},
            {"11223", "Delivered"},
            {"44556", "In Transit"},
            {"78901", "Delivered"}
        };

        // User input for tracking number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Parcel Tracking Number: ");
        String trackingNumber = scanner.nextLine();

        // Simulate tracking
        boolean found = false;
        for (String[] parcel : parcels) {
            if (parcel[0].equals(trackingNumber)) {
                found = true;
                System.out.println("Tracking Number: " + trackingNumber);
                System.out.println("Parcel Status: " + parcel[1]);
                break;
            }
        }

        if (!found) {
            System.out.println("Parcel not found.");
        }

        scanner.close();
    }
}

