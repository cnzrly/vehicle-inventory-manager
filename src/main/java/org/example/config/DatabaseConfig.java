package org.example.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.example.exception.DatabaseException;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import javax.sql.DataSource; // HikariDataSource bu arayüzü implemente eder.

public class DatabaseConfig {


    private final DataSource dataSource;
    private final Properties properties = new Properties();

    public DatabaseConfig() {

        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("application.properties")) {
            if (inputStream == null) {
                throw new RuntimeException("application.properties not found");
            }
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load application.properties", e);
        }


        String url = System.getenv("DB_URL") != null ? System.getenv("DB_URL") : properties.getProperty("db.url");
        String username = System.getenv("DB_USERNAME") != null ? System.getenv("DB_USERNAME") : properties.getProperty("db.username");
        String password = System.getenv("DB_PASSWORD") != null ? System.getenv("DB_PASSWORD") : properties.getProperty("db.password");


        try {
            this.dataSource = new HikariDataSource(createHikariConfig(url, username, password));
        } catch (Exception e) {

            throw new DatabaseException("Failed to initialize database connection pool. Error: " + e.getMessage());
        }
    }

    private HikariConfig createHikariConfig(String url, String username, String password) {
        HikariConfig config = new HikariConfig();


        config.setJdbcUrl(url);
        config.setUsername(username);
        config.setPassword(password);


        config.setMaximumPoolSize(Integer.parseInt(properties.getProperty("hikari.pool.size", "10")));
        config.setConnectionTimeout(Integer.parseInt(properties.getProperty("hikari.pool.timeout", "30000")));
        config.setIdleTimeout(Integer.getInteger(properties.getProperty("hikari.pool.idleTimeout", "600000")));
        config.setMaxLifetime(Integer.parseInt(properties.getProperty("hikari.pool.maxLifetime", "1800000")));

        return config;
    }


    public Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new DatabaseException("Failed to acquire database connection from pool. Error: " + e.getMessage());
        }
    }
}