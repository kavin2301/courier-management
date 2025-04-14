package main;

import dao.CourierServiceDb;
import entity.Courier;

import java.sql.Connection;
import java.util.Scanner;

import util.DBConnUtil;
import util.DBPropertyUtil;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String connectionString = DBPropertyUtil.getConnectionString("db.properties");
        Connection connection = DBConnUtil.getConnection(connectionString);

        if (connection == null) {
            System.err.println("Exiting: Unable to establish DB connection.");
            return;
        }

        CourierServiceDb service = new CourierServiceDb(connection);

        boolean exit = false;

        while (!exit) {
            System.out.println("\n========== Courier Management Menu ==========");
            System.out.println("1. Add New Courier");
            System.out.println("2. Assign Courier to Employee");
            System.out.println("3. Update Courier Status");
            System.out.println("4. Get Delivery History");
            System.out.println("5. Generate Shipment Status Report");
            System.out.println("6. Generate Revenue Report");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Sender User ID: ");
                    int senderId = scanner.nextInt();
                    System.out.print("Receiver User ID: ");
                    int receiverId = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Package Name: ");
                    String packageName = scanner.nextLine();
                    System.out.print("Number of Packages: ");
                    int numPackages = scanner.nextInt();
                    System.out.print("Weight (kg): ");
                    double weight = scanner.nextDouble();
                    System.out.print("Service ID: ");
                    int serviceId = scanner.nextInt();

                    Courier newCourier = new Courier(senderId, receiverId, packageName, numPackages, weight, serviceId);
                    service.addCourier(newCourier);
                    System.out.println("Courier added successfully with tracking number: " + newCourier.getTrackingNumber());
                    break;

                case 2:
                    System.out.print("Enter Courier ID: ");
                    int courierId = scanner.nextInt();
                    System.out.print("Enter Employee ID to assign: ");
                    int employeeId = scanner.nextInt();
                    service.assignCourier(courierId, employeeId);
                    break;

                case 3:
                    System.out.print("Enter Courier ID: ");
                    int cid = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter new Status(Proceesing/Cancelled/Delivered): ");
                    String newStatus = scanner.nextLine();
                    service.updateCourierStatus(cid, newStatus);
                    break;

                case 4:
                    System.out.print("Enter Tracking Number: ");
                    String trackingNumber = scanner.nextLine();
                    service.getDeliveryHistory(trackingNumber);
                    break;

                case 5:
                    service.generateShipmentStatusReport();
                    break;

                case 6:
                    service.generateRevenueReport();
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Database connection closed.");
            }
        } catch (Exception e) {
            System.err.println("Error closing DB connection: " + e.getMessage());
        }

        scanner.close();
        System.out.println("Scanner closed. Goodbye!");
    }
}