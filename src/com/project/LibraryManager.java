package com.project;

import java.sql.*;
import java.util.Scanner;

    public class LibraryManager {
        public static void main(String[] args) {
            try {
                Connection con = DriverManager.getConnection(
                        DBConfig.url, DBConfig.username, DBConfig.password
                );
                Scanner sc = new Scanner(System.in);

                while (true) {
                    System.out.println("\n=== LIBRARY MANAGEMENT SYSTEM ===");
                    System.out.println("1. Insert Book");
                    System.out.println("2. Update Book");
                    System.out.println("3. Delete Book");
                    System.out.println("4. Search Book");
                    System.out.println("5. Exit");
                    System.out.println("Enter your choice");

                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Enter a serial_no of book");
                            int serial_no = sc.nextInt();
                            System.out.println("Enter the book_name");
                            String book_name = sc.next();
                            System.out.println("Enter the price");
                            Double price = sc.nextDouble();

                            PreparedStatement ps = con.prepareStatement("insert into books(serial_no,book_name,price) values(?,?,?)");
                            ps.setInt(1, serial_no);
                            ps.setString(2, book_name);
                            ps.setDouble(3, price);

                            int rows = ps.executeUpdate();
                            System.out.println("Rows inserted: " + rows);
                            break;

                        case 2:
                            System.out.println("Enter a serial_no of book to update");
                            int serial = sc.nextInt();
                            System.out.println("Enter new price");
                            Double pricetag = sc.nextDouble();

                            PreparedStatement pst = con.prepareStatement("update books set serial_no=? where price=?");
                            pst.setInt(1, serial);
                            pst.setDouble(2, pricetag);

                            int updated = pst.executeUpdate();
                            if (updated > 0) {
                                System.out.println("Record Updated: ");
                            } else {
                                System.out.println("Record not found: ");
                            }
                            break;

                        case 3:
                            System.out.println("Enter a serial_no of book to delete");
                            int num = sc.nextInt();
                            PreparedStatement pst1 = con.prepareStatement("delete from books where serial_no=?");
                            pst1.setInt(1, num);

                            int delete = pst1.executeUpdate();
                            if (delete > 0) {
                                System.out.println("Record deleted successfully");
                            } else {
                                System.out.println("Record not deleted");
                            }
                            break;

                        case 4:
                            System.out.println("Enter a serial_no of book to search");
                            int serial__num = sc.nextInt();

                            PreparedStatement psm = con.prepareStatement("select * from books where serial_no=?");
                            psm.setInt(1, serial__num);

                            ResultSet rs = psm.executeQuery();
                            if (rs.next()) {
                                System.out.println("Data found: " + rs.getInt(1) +
                                        " | " + rs.getString(2) + " | " + rs.getDouble(3));
                            } else {
                                System.out.println("Data not found");
                            }
                            break;

                        case 5:
                            con.close();
                            sc.close();
                            System.out.println("Exiting");
                            System.exit(0);

                        default:
                            System.out.println("Invalid choice.Please try again");

                    }

                }

            }catch(SQLException e){
                System.out.println("Database error: " +e.getMessage());

            }
            catch (Exception e){
                e.printStackTrace();
            }
        }

    }


