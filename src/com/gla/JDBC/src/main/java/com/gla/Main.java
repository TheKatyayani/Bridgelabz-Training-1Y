package com.gla;

import java.sql.*;

public class Main {
    static void main() {
        String url = "jdbc:mysql://localhost:3306/users";
        String user = "root";
        String pwd = "Kirtikoyal1509";
        String selectEmployee = " Select * from employee ";
        String createTable = "create table employee (id int primary key auto_increment,name varchar(20),department varchar(20))";
        String insertData = "insert into employee(name,department) values('Krunali','Operations'),('Amol','PowerBI'),('Rehan','PLSQL')";
     //   String dropTable = "drop table employee";
        try (Connection con = DriverManager.getConnection(url, user, pwd);
             Statement stmt = con.createStatement()) {

            int rowsUpdated1 = stmt.executeUpdate(createTable);
            int rowsUpdated2 = stmt.executeUpdate(insertData);

            boolean res1 = stmt.execute(insertData);

            if (res1) {
                ResultSet rs = stmt.getResultSet();
                while (rs.next()) {
                    System.out.println("id : " + rs.getInt("id"));
                    System.out.println("name : " + rs.getString("name"));
                    System.out.println("department : " + rs.getString("department"));
                }
            } else {
                int rowsUpdated = stmt.getUpdateCount();
            }

            try (ResultSet rs = stmt.executeQuery(selectEmployee)) {
                while (rs.next()) {
                    System.out.println("id : " + rs.getInt("id"));
                    System.out.println("name : " + rs.getString("name"));
                    System.out.println("department : " + rs.getString("department"));
                }

            }

           // int drop = stmt.executeUpdate(dropTable);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
