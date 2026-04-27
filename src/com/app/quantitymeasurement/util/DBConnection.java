package com.app.quantitymeasurement.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static {
        try {
            Connection conn = getConnection();
            conn.createStatement().execute(
                    "CREATE TABLE IF NOT EXISTS measurement (" +
                            "id INT AUTO_INCREMENT PRIMARY KEY," +
                            "operation VARCHAR(255)," +
                            "result DOUBLE)"
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}