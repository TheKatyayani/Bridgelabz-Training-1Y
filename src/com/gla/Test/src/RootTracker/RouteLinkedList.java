package RootTracker;

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
    private final String PASS = "Kirtikoyal1509"; // Change this to your actual password


    public void saveCheckpointsToDB() {
        String insertSQL = "INSERT INTO checkpoints (checkpoint_id, location_name, distance_from_last, " +
                "expected_duration, actual_duration, checkpoint_type) " +
                "VALUES (?, ?, ?, ?, ?, ?) " +
                "ON DUPLICATE KEY UPDATE location_name=VALUES(location_name), " +
                "distance_from_last=VALUES(distance_from_last), " +
                "actual_duration=VALUES(actual_duration)";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

            Node temp = head;
            while (temp != null) {
                Checkpoint c = temp.data;
                pstmt.setString(1, c.checkpointId);
                pstmt.setString(2, c.locationName);
                pstmt.setDouble(3, c.distanceFromLast);
                pstmt.setDouble(4, c.expectedDuration);
                pstmt.setDouble(5, c.actualDuration);
                pstmt.setString(6, c.getType()); // This gets "FuelCheckpoint", etc.
                pstmt.addBatch();
                temp = temp.next;
            }
            pstmt.executeBatch();
            System.out.println("Route successfully saved to 'logistics' database.");

        } catch (SQLException e) {
            System.err.println("Save Error: " + e.getMessage());
        }
    }


//    public void loadCheckpointsFromDB() {
//        String selectSQL = "SELECT * FROM checkpoints";
//
//        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(selectSQL)) {
//
//
//            head = null;
//
//            while (rs.next()) {
//                String id = rs.getString("checkpoint_id");
//                String loc = rs.getString("location_name");
//                double dist = rs.getDouble("distance_from_last");
//                double exp = rs.getDouble("expected_duration");
//                double act = rs.getDouble("actual_duration");
//                String type = rs.getString("checkpoint_type");
//
//                Checkpoint c = null;
//                // Reconstruct the specific object based on the type stored in SQL
//                switch (type) {
//                    case "DeliveryCheckpoint":
//                        c = new DeliveryCheckpoint(id, loc, dist, exp, act);
//                        break;
//                    case "FuelCheckpoint":
//                        c = new FuelCheckpoint(id, loc, dist, exp, act);
//                        break;
//                    case "RestCheckpoint":
//                        c = new RestCheckpoint(id, loc, dist, exp, act);
//                        break;
//                }
//
//                if (c != null) {
//                    addCheckpoint((T) c);
//                }
//            }
//            System.out.println("Data loaded into RouteLinkedList successfully.");
//
//        } catch (SQLException e) {
//            System.err.println("Load Error: " + e.getMessage());
//        }
//    }
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
        Node temp = head; // head must be defined as 'private Node head;' at the top
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