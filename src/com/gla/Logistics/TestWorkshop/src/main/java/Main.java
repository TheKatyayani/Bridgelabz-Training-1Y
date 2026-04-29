import java.sql.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("--- Welcome to RootTracker ---");
        System.out.print("Enter Driver ID (e.g., D1204): ");
        String dId = scanner.nextLine();
        System.out.print("Enter Driver Name: ");
        String dName = scanner.nextLine();

        Driver driver = new Driver(dId, dName);


        saveDriverToDB(dId, dName);


        boolean adding = true;
        while (adding) {
            System.out.println("\nSelect Checkpoint Type to add:");
            System.out.println("1. Delivery  2. Fuel  3. Rest  4. Finish & Save");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 4) {
                adding = false;
                break;
            }

            System.out.print("Enter Checkpoint ID: ");
            String cId = scanner.nextLine();
            System.out.print("Enter Location Name: ");
            String loc = scanner.nextLine();
            System.out.print("Enter Distance from last: ");
            double dist = scanner.nextDouble();
            System.out.print("Enter Expected Duration: ");
            double exp = scanner.nextDouble();
            System.out.print("Enter Actual Duration: ");
            double act = scanner.nextDouble();

            switch (choice) {
                case 1 -> driver.routeHistory.addCheckpoint(new DeliveryCheckpoint(cId, loc, dist, exp, act));
                case 2 -> driver.routeHistory.addCheckpoint(new FuelCheckpoint(cId, loc, dist, exp, act));
                case 3 -> driver.routeHistory.addCheckpoint(new RestCheckpoint(cId, loc, dist, exp, act));
                default -> System.out.println("Invalid choice!");
            }
        }


        System.out.println("\nSaving all checkpoints to database...");
        driver.routeHistory.saveCheckpointsToDB();

        System.out.println("\n--- Final Summary ---");
        driver.printSummary();

        scanner.close();
    }


    public static void saveDriverToDB(String id, String name) {
        String url = "jdbc:mysql://localhost:3306/logistics";
        String sql = "INSERT IGNORE INTO drivers (driverId, name) VALUES (?, ?)";
        try (java.sql.Connection conn = java.sql.DriverManager.getConnection(url, "root", "Kirtikoyal1509");
             java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, id);
            pstmt.setString(2, name);
            pstmt.executeUpdate();
        } catch (java.sql.SQLException e) {
            System.err.println("Driver Save Error: " + e.getMessage());
        }
    }
}