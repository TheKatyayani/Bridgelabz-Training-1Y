package com.gla;

import java.util.Scanner;

public class Main {

    String url = "jdbc:mysql://localhost:3306/library_db";
    String user = "root";
    String pwd = "Kirtikoyal1509";
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Admin: Add Book \n 2. Stock: View/Count \n 3. Student: Issue/Return \n 4. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("ID: "); int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Name: "); String name = sc.nextLine();
                    lib.addBook(id, name);
                    break;
                case 2:
                    lib.viewBooks();
                    lib.checkStock();
                    break;
                case 3:
                    System.out.print("1. Issue 2. Return: "); int action = sc.nextInt();
                    System.out.print("Book ID: "); int bId = sc.nextInt();
                    if (action == 1) lib.issueBook(bId);
                    else lib.returnBook(bId);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}


