package com.hexaware.assignment;

public class ShippingCost {

    public static double calculateShippingCost(double distance, double weight) {
        double costPerMile = 0.5; 
        double costPerKg = 1.2; 
        return (distance * costPerMile) + (weight * costPerKg);
    }

    public static void main(String[] args) {
        double distance = 100; 
        double weight = 10; 
        double cost = calculateShippingCost(distance, weight);
        System.out.println("Shipping cost: $" + cost);
    }
}

