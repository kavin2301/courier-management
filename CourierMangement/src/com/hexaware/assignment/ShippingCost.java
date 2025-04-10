package com.hexaware.assignment;

public class ShippingCost {

    public static double calculateShippingCost(double distance, double weight) {
        double costPerMile = 0.5; // Cost per mile
        double costPerKg = 1.2; // Cost per kg
        return (distance * costPerMile) + (weight * costPerKg);
    }

    public static void main(String[] args) {
        double distance = 100; // in miles
        double weight = 10; // in kg
        double cost = calculateShippingCost(distance, weight);
        System.out.println("Shipping cost: $" + cost);
    }
}

