package com.example.CollegeDirectory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLConnection {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/mydatabase";
        String user = "postgres";
        String password = "Shiv@7050";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to PostgreSQL database!");
            // Use the connection here
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
