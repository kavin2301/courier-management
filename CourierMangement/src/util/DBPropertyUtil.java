package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DBPropertyUtil {

    public static String getConnectionString(String propertyFileName) {
        String connectionString = null;
        try {
            System.out.println("Attempting to load DB properties from: " + propertyFileName);
            
            Properties props = new Properties();
            FileInputStream fis = new FileInputStream(propertyFileName);
            props.load(fis);

            String url = props.getProperty("db.url");         // Already includes jdbc:mysql://...
            String username = props.getProperty("db.username");
            String password = props.getProperty("db.password");

            if (url == null || username == null || password == null) {
                System.err.println("Missing one or more properties (url, username, password).");
            } else {
                connectionString = url + "?user=" + username + "&password=" + password;
            }

        } catch (IOException e) {
            System.err.println("Error loading properties: " + e.getMessage());
        }

        return connectionString;
    }
}
