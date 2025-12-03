package org.example.config;

import org.example.exception.DatabaseException;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConfig {
    private final Properties properties = new Properties();
    public DatabaseConfig() {
        try(InputStream inputStream = getClass().getClassLoader().getResourceAsStream("application.properties")) {
            if(inputStream == null) {
                throw new RuntimeException("application.properties not found");
            }
            properties.load(inputStream);
        } catch (IOException e){
            throw new RuntimeException("Failed to load application.properties", e);
        }
    }
    public Connection getConnection(){
        try{
            String url = properties.getProperty("db.url");
            String username = properties.getProperty("db.username");
            String password = properties.getProperty("db.password");
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e){
            throw new DatabaseException("Failed to establish database connection. Check connection details and ensure PostgreSQL is running. Error: " + e.getMessage());
        }

    }
}
