package com.hexaware.assignment;

public class CourierAssignment {

	public static void main(String[] args) {
		 String[] employees = {"John", "Alice", "Bob"};
	        int[] loadCapacity = {2, 1, 0}; // Number of packages they can still handle

	        boolean assigned = false;
	        for (int i = 0; i < employees.length; i++) {
	            if (loadCapacity[i] > 0) {
	                System.out.println("Courier assigned to: " + employees[i]);
	                loadCapacity[i]--;
	                assigned = true;
	                break;
	            }
	        }

	        if (!assigned) {
	            System.out.println("No employee available for courier assignment.");
	        }

	}

}
