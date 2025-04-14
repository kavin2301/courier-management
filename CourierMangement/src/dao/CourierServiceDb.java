package dao;

import entity.Courier;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourierServiceDb {

    private Connection connection;

    public CourierServiceDb(Connection connection) {
        this.connection = connection;
    }

    public void addCourier(Courier courier) {
        String sql = "INSERT INTO Courier (senderUserID, receiverUserID, packageName, numberOfPackages, weight, serviceID, trackingNumber, status, createdDate) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, courier.getSenderUserID());
            stmt.setInt(2, courier.getReceiverUserID());
            stmt.setString(3, courier.getPackageName());
            stmt.setInt(4, courier.getNumberOfPackages());
            stmt.setDouble(5, courier.getWeight());
            stmt.setInt(6, courier.getServiceID());
            stmt.setString(7, courier.getTrackingNumber());
            stmt.setString(8, courier.getStatus());
            stmt.setDate(9, new java.sql.Date(courier.getCreatedDate().getTime()));

            stmt.executeUpdate();
            System.out.println("Courier added successfully.");
        } catch (SQLException e) {
            System.err.println("Error adding courier: " + e.getMessage());
        }
    }

    public void assignCourier(int courierId, int employeeId) {
        String sql = "UPDATE Courier SET employeeID = ? WHERE courierID = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, employeeId);
            stmt.setInt(2, courierId);
            int rows = stmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Courier assigned successfully.");
            } else {
                System.out.println("Courier ID not found.");
            }
        } catch (SQLException e) {
            System.err.println("Error assigning courier: " + e.getMessage());
        }
    }

    public void updateCourierStatus(String trackingNumber, String newStatus) {
        String sql = "UPDATE Courier SET status = ? WHERE trackingNumber = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, newStatus);
            stmt.setString(2, trackingNumber);
            int rows = stmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Courier status updated.");
            } else {
                System.out.println("Tracking number not found.");
            }
        } catch (SQLException e) {
            System.err.println("Error updating status: " + e.getMessage());
        }
    }

    public void updateCourierStatus(int courierId, String newStatus) {
        String sql = "UPDATE Courier SET status = ? WHERE courierID = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, newStatus);
            stmt.setInt(2, courierId);
            int rows = stmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Courier status updated.");
            } else {
                System.out.println("Courier ID not found.");
            }
        } catch (SQLException e) {
            System.err.println("Error updating status: " + e.getMessage());
        }
    }

    public void getDeliveryHistory(String trackingNumber) {
        String sql = "SELECT * FROM Courier WHERE trackingNumber = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, trackingNumber);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                System.out.println("Courier ID: " + rs.getInt("courierID"));
                System.out.println("Status: " + rs.getString("status"));
                System.out.println("Created Date: " + rs.getDate("createdDate"));
                System.out.println("Delivery Date: " + rs.getDate("deliveryDate"));
            } else {
                System.out.println("No courier found with this tracking number.");
            }
        } catch (SQLException e) {
            System.err.println("Error retrieving history: " + e.getMessage());
        }
    }

    public void generateShipmentStatusReport() {
        String sql = "SELECT status, COUNT(*) AS count FROM Courier GROUP BY status";

        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("\nShipment Status Report:");
            while (rs.next()) {
                System.out.println(rs.getString("status") + ": " + rs.getInt("count"));
            }
        } catch (SQLException e) {
            System.err.println("Error generating report: " + e.getMessage());
        }
    }

    public void generateRevenueReport() {
        String sql = "SELECT SUM(cs.Cost * c.NumberOfPackages) AS totalRevenue " +
                     "FROM Courier c " +
                     "JOIN CourierServices cs ON c.ServiceID = cs.ServiceID";

        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                System.out.printf("Total Revenue: ₹%.2f\n", rs.getDouble("totalRevenue"));
            } else {
                System.out.println("No revenue data found.");
            }
        } catch (SQLException e) {
            System.err.println("Error generating revenue report: " + e.getMessage());
        }
    }
}
