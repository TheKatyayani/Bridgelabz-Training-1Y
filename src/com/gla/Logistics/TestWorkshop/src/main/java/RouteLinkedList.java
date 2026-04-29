

import java.sql.*;

public class RouteLinkedList<T extends Checkpoint> {

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node head;

    private final String DB_URL = "jdbc:mysql://localhost:3306/logistics";
    private final String USER = "root";
    private final String PASS = "Kirtikoyal1509";

    public void saveCheckpointsToDB() {
        String insertSQL = "INSERT INTO checkpoints (checkpointId, driverId, locationName, " +
                "distanceFromLast, expectedDuration, actualDuration, type, isCritical) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

            Node temp = head;
            while (temp != null) {
                Checkpoint c = temp.data;
                pstmt.setString(1, c.checkpointId);
                pstmt.setString(2, "D1204"); // Later you can pass this as a parameter
                pstmt.setString(3, c.locationName);
                pstmt.setDouble(4, c.distanceFromLast);
                pstmt.setDouble(5, c.expectedDuration);
                pstmt.setDouble(6, c.actualDuration);
                pstmt.setString(7, c.getType());
                pstmt.setBoolean(8, c.isCritical());

                pstmt.addBatch();
                temp = temp.next;
            }
            pstmt.executeBatch();
            System.out.println("Data successfully saved to SQL.");
        } catch (SQLException e) {
            System.err.println("Save Error: " + e.getMessage());
        }
    } // <--- THIS BRACE WAS MISSING

    public double computeTotalPenalty() {
        double total = 0;
        Node temp = head;
        while (temp != null) {
            total += temp.data.calculatePenalty();
            temp = temp.next;
        }
        return total;
    }

    public boolean checkCriticalConsistency() {
        boolean hasDelivery = false;
        boolean hasFuel = false;

        Node temp = head;
        while (temp != null) {
            if (temp.data instanceof DeliveryCheckpoint) hasDelivery = true;
            if (temp.data instanceof FuelCheckpoint) hasFuel = true;
            temp = temp.next;
        }
        return hasDelivery && hasFuel;
    }

    public double computeTotalDistance() {
        double total = 0;
        Node temp = head;
        while (temp != null) {
            total += temp.data.distanceFromLast;
            temp = temp.next;
        }
        return total;
    }

    public void addCheckpoint(T checkpoint) {
        Node newNode = new Node(checkpoint);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void printRoute() {
        Node temp = head;
        int i = 1;
        while (temp != null) {
            Checkpoint c = temp.data;
            System.out.println(i + ". " + c.getType() + " at " + c.locationName + " (Penalty: " + c.calculatePenalty() + ")");
            temp = temp.next;
            i++;
        }
    }
}