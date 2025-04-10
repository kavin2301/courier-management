package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnUtil {

    public static Connection getConnection(String connectionString) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionString);
            System.out.println("Database connection established successfully.");
        } catch (SQLException e) {
            System.err.println("Failed to connect to DB: " + e.getMessage());
        }
        return connection;
    }
}
