package com.gla;

import java.sql.*;

import java.util.ArrayList;


public class Library {
    private final String url = "jdbc:mysql://localhost:3306/library_db";
    private final String user = "root";
    private final String password = "Kirtikoyal1509";

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public void addBook(int id, String name) {
        String sql = "INSERT INTO books(id, name, is_issued) VALUES(?, ?, false)";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.executeUpdate();
            System.out.println("Book added to Database!");
        } catch (SQLException e) { System.out.println("Error: " + e.getMessage()); }
    }

    public void viewBooks() {
        String sql = "SELECT * FROM books";
        try (Connection conn = connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                String status = rs.getBoolean("is_issued") ? "[Issued]" : "[Available]";
                System.out.println("ID: " + rs.getInt("id") + " | Name: " + rs.getString("name") + " | " + status);
            }
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void checkStock() {
        String sql = "SELECT COUNT(*) as total, SUM(CASE WHEN is_issued = 0 THEN 1 ELSE 0 END) as avail FROM books";
        try (Connection conn = connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                System.out.println("Total Books: " + rs.getInt("total") + " | Available: " + rs.getInt("avail"));
            }
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void issueBook(int id) {
        String sql = "UPDATE books SET is_issued = TRUE WHERE id = ? AND is_issued = FALSE";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            if (pstmt.executeUpdate() > 0) System.out.println("Book issued!");
            else System.out.println("Book not found or already issued.");
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void returnBook(int id) {
        String sql = "UPDATE books SET is_issued = FALSE WHERE id = ?";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            if (pstmt.executeUpdate() > 0) System.out.println("Book returned!");
            else System.out.println("Invalid ID.");
        } catch (SQLException e) { e.printStackTrace(); }
    }
}
