package com.hexaware.assignment;

public class ParcelWeightCategory {

	public static void main(String[] args) {
		double weight = 12.5; 
        String category;

        if (weight <= 5) {
            category = "Light";
        } else if (weight <= 15) {
            category = "Medium";
        } else {
            category = "Heavy";
        }

        switch (category) {
            case "Light":
                System.out.println("The parcel is Light.");
                break;
            case "Medium":
                System.out.println("The parcel is Medium.");
                break;
            case "Heavy":
                System.out.println("The parcel is Heavy.");
                break;
            default:
                System.out.println("Unknown category.");
        }
	}

}
