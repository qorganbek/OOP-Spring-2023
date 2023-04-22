package com.example;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Optional {

    private static Connection connection;

    private static void connect(){
        try{
            connection = DriverManager.getConnection("jdbc:derby:C:\\Study\\Spring2023\\OOP\\lab 14\\14-JDBC-practices-SimpleJDBCExample\\lib\\javaoop", "Dima", "tiger");
        }catch ( SQLException e){
            e.printStackTrace();
        }
    }

    private static void printEmployees(){
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM EMPLOYEE");

            while (rs.next()) {
                int empID = rs.getInt("ID");
                String first = rs.getString("FIRSTNAME");
                String last = rs.getString("LASTNAME");
                Date birth_date = rs.getDate("BIRTHDATE");
                float salary = rs.getFloat("SALARY");
                System.out.println("Employee ID:   " + empID + "\n"
                        + "Employee Name: " + first.trim() + " " + last.trim() + "\n"
                        + "Birth Date:    " + birth_date + "\n"
                        + "Salary:        " + salary + "\n");

            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    private static void addEmployee(){
        try{
            PreparedStatement statement = connection.prepareStatement("INSERT INTO EMPLOYEE (ID, FIRSTNAME, LASTNAME, BIRTHDATE, SALARY) VALUES (?, ?, ?, ?, ?)");
            statement.setInt(1, 555);
            statement.setString(2, "Dinmukhammed");
            statement.setString(3, "Korganbek");
            statement.setDate(4, new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse("2003-12-19").getTime()));
            statement.setDouble(5, 555555.55);

            statement.executeUpdate();
        }catch (SQLException | ParseException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        connect();
        printEmployees();
        addEmployee();
        printEmployees();
    }
}
