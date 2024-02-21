package org.example;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //"jdbc:sqlserver://localhost\\sqlexpress;user=sa;password=secret";
    private static final String JDBC_URL = "jdbc:sqlserver://localhost\\SQLEXPRESS;database=Dapper;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";
    private static final String USERNAME = "YourUsername";
    private static final String PASSWORD = "YourPassword";

    public static void main(String[] args) throws SQLException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        /*
         Import package
         load and register driver
         create connection
         create statement
         execute statement
         process the results
         close


          Connect to default instance of SQL server running on the same machine as the JDBC client, using Windows authentication:
jdbc:sqlserver://localhost;integratedSecurity=true;
-          Connect to an instance named sqlexpress on the host dbServer, using SQL Server authentication:
jdbc:sqlserver://dbHost\sqlexpress;user=sa;password=secret
-          Connect to a named database testdb on localhost using Windows authentication:
jdbc:sqlserver://localhost:1433;databaseName=testdb;integratedSecurity=true;
         */

        // Class.forName("org.postg")
        // DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());

        Main main = new Main();
        main.getSingleRecord();
        main.getMultipleRecord();
        main.CreateRecord();

    }

    private void getSingleRecord() {
        try (Connection connection = DriverManager.getConnection(JDBC_URL)) {
            if (connection != null) {
                System.out.println("Connected to the database!");
                Statement st = connection.createStatement();
                ResultSet rs = st.executeQuery("select Name from tbl_user where userid = 'adminuser'");
                rs.next();
                String name = rs.getString("Name");
                System.out.println(name);


                // You can execute SQL queries or statements here
                // Example:
                // Statement statement = connection.createStatement();
                // ResultSet resultSet = statement.executeQuery("SELECT * FROM YourTableName");

                // Don't forget to close the resources after use
            } else {
                System.out.println("Failed to make connection!");
            }
            // connection.close();
        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
        }
    }

    private void getMultipleRecord() {
        try (Connection connection = DriverManager.getConnection(JDBC_URL)) {
            if (connection != null) {
                System.out.println("Connected to the database!");
                Statement st = connection.createStatement();
                ResultSet rs = st.executeQuery("select * from tbl_user");
//                rs.next();
//                String name = rs.getString("Name");
//                System.out.println(name);
                while (rs.next()) {
                    String userid = rs.getString("userid");
                    String name = rs.getString("Name");
                    String password = rs.getString("password");
                    String Email = rs.getString("Email");
                    System.out.println(String.format("UserID %1$s UserName %2$s Password %2$s Email %s.", userid, name, password, Email));
                }

            } else {
                System.out.println("Failed to make connection!");
            }
            // connection.close();
        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
        }
    }

    private void CreateRecord() {
        try (Connection connection = DriverManager.getConnection(JDBC_URL)) {
            if (connection != null) {
                System.out.println("Connected to the database!");
                Statement st = connection.createStatement();
                boolean status = st.execute("insert into tbl_user values('java', 'java', 'java@123', 'java@java.com', 'admin', 1)");
//                rs.next();
//                String name = rs.getString("Name");
//                System.out.println(name);
//                while (rs.next()) {
//                    String userid = rs.getString("userid");
//                    String name = rs.getString("Name");
//                    String password = rs.getString("password");
//                    String Email = rs.getString("Email");
//                    System.out.println(String.format("UserID %1$s UserName %2$s Password %2$s Email %s.", userid, name, password, Email));
//                }

            } else {
                System.out.println("Failed to make connection!");
            }
            // connection.close();
        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
        }
    }
}