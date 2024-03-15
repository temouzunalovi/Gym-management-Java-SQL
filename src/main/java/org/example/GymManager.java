package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GymManager {
    private Connection connection;

    public GymManager() {
        try {
            // Register JDBC driver (this step is optional for newer versions of JDBC drivers)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "1234");
            System.out.println("Connected to the database");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to connect to the database", e);
        }
    }

    // Method to add a member to the database
    public void addMember(Member member) {
        try {
            String query = "INSERT INTO members (name, phoneNumber, email) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, member.getName());
            statement.setString(2, member.getPhoneNumber());
            statement.setString(3, member.getEmail());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Member added successfully");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Other CRUD methods...

    public static void main(String[] args) {
        GymManager manager = new GymManager();
        // Use manager object to call methods for managing members, staff, etc.
    }
}
