package org.example;

import org.example.config.DatabaseConfig;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        try {
            // 1. Initialize Configuration
            DatabaseConfig databaseConfig = new DatabaseConfig();

            // 2. Verify Connection
            databaseConfig.getConnection();
            System.out.println("Database connection successful!");

            // Keep the application running
            System.out.println("Application is running... (Press Ctrl+C to stop)");
            while (true) {
                Thread.sleep(60000); // Sleep for 1 minute
            }

        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
