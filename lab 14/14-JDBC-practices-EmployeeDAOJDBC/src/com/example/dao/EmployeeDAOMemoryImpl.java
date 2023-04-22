package com.example.dao;

import com.example.model.Employee;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOMemoryImpl implements EmployeeDAO {

    // not thread-safe
    private static Employee[] employeeArray = new Employee[10];
    private Connection connection = null;

    // package level access
    EmployeeDAOMemoryImpl() {
        try{
            connection = DriverManager.getConnection("jdbc:derby:C:\\Study\\Spring2023\\OOP\\lab 14\\14-JDBC-practices-EmployeeDAOJDBC\\lib\\javaoop", "Dima", "tiger");
        }catch (SQLException e){
            e.printStackTrace();
            System.exit(-1);
        }
    }

    // Add an Employee record
    public void add(Employee emp) throws DAOException {
//        if(employeeArray[emp.getId()] != null) {
//            throw new DAOException("Error adding employee in DAO, employee id already exists " + emp.getId());
//        }
//        try {
//            employeeArray[emp.getId()] = emp;
//        } catch (ArrayIndexOutOfBoundsException e) {
//            throw new DAOException("Error adding employee in DAO, id must be less than " + employeeArray.length);
//        }

        if(findById(emp.getId()) == null) {

            try {
                PreparedStatement statement = connection.prepareStatement("INSERT INTO EMPLOYEE (ID, FIRSTNAME, LASTNAME, BIRTHDATE, SALARY) VALUES (?, ?, ?, ?, ?)");
                statement.setInt(1, emp.getId());
                statement.setString(2, emp.getFirstName());
                statement.setString(3, emp.getLastName());
                statement.setDate(4, new Date(emp.getBirthDate().getTime()));
                statement.setDouble(5, emp.getSalary());

                int rows = statement.executeUpdate();

                if (rows != 1) {
                    throw new DAOException("Error adding employee");
                }
            } catch (SQLException e) {
                throw new DAOException("Error adding Employee in DAO", e);
            }
        }else {
            throw new DAOException("Employee with ID " + emp.getId() + " exists");
        }
    }

    // Update an employee record
    public void update(Employee emp) throws DAOException {
//        if(employeeArray[emp.getId()] == null) {
//            throw new DAOException("Error updating employee in DAO, no such employee " + emp.getId());
//        }
//        try {
//            employeeArray[emp.getId()] = emp;
//        } catch (ArrayIndexOutOfBoundsException e) {
//            throw new DAOException("Error updating employee in DAO, id must be less than " + employeeArray.length);
//        }

        if(findById(emp.getId()) != null){
            try{
                PreparedStatement statement = connection.prepareStatement("UPDATE EMPLOYEE SET FIRSTNAME=?, SET LASTNAME=?, SET BIRTHDATE=?, SET SALARY=? WHERE ID=?");
                statement.setString(1, emp.getFirstName());
                statement.setString(2, emp.getLastName());
                statement.setDate(3, new Date(emp.getBirthDate().getTime()));
                statement.setDouble(4, emp.getSalary());
                statement.setInt(5, emp.getId());

                int rows = statement.executeUpdate();

                if (rows != 1) {
                    throw new DAOException("Error updating employee");
                }

            } catch (SQLException e) {
                throw new DAOException("Error updating employee", e);
            }
        }else {
            throw new DAOException("Employee with ID " + emp.getId() + " not founded!");
        }

    }

    // Delete an employee record that has this ID
    public void delete(int id) throws DAOException {
//        if(employeeArray[id] == null) {
//            throw new DAOException("Error deleting employee in DAO, no such employee " + id);
//        }
//        try {
//            employeeArray[id] = null;
//        } catch (ArrayIndexOutOfBoundsException e) {
//            throw new DAOException("Error deleting employee in DAO, id must be less than " + employeeArray.length);
//        }

        if(findById(id) != null){
            try{
                PreparedStatement statement = connection.prepareStatement("DELETE FROM EMPLOYEE WHERE ID=?");
                statement.setInt(1, id);

                int rows = statement.executeUpdate();

                if (rows != 1) {
                    throw new DAOException("Error deleting employee");
                }

            } catch (SQLException e) {
                throw new DAOException("Error deleting employee", e);
            }
        }else {
            throw new DAOException("Employee with ID " + id + " not founded!");
        }
    }

    // Find an Employee record using this ID
    public Employee findById(int id) throws DAOException {
//        try {
//            return employeeArray[id];
//        } catch (ArrayIndexOutOfBoundsException e) {
//            throw new DAOException("Error finding employee in DAO", e);
//        }
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM EMPLOYEE WHERE ID=?");
            statement.setInt(1, id);

            ResultSet rs = statement.executeQuery();

            if(!rs.next()){
                return null;
            }
            return new Employee(rs.getInt("ID"), rs.getString("FIRSTNAME"), rs.getString("LASTNAME"), rs.getDate("BIRTHDATE"), rs.getFloat("SALARY"));
        }catch (SQLException e){
            throw new DAOException("Error finding employee in DAO", e);
        }
    }

    // Return an array of all of the Employee records
    // We are using a collection List object to store the results
    // This makes it easier to just add to the collection
    public Employee[] getAllEmployees() throws DAOException {
        List<Employee> emps = new ArrayList<>();
        // Iterate through the memory array and find Employee objects
//        for (Employee e : employeeArray) {
//            if (e != null) {
//                emps.add(e);
//            }
//        }

        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM EMPLOYEE");


            ResultSet rs = statement.executeQuery();

            while(rs.next()){
                emps.add(new Employee(rs.getInt("ID"), rs.getString("FIRSTNAME"), rs.getString("LASTNAME"), rs.getDate("BIRTHDATE"), rs.getFloat("SALARY")));
            }
        }catch (SQLException e){
            throw new DAOException("Error finding employees in DAO", e);
        }

        return emps.toArray(new Employee[0]);
    }

    @Override
    public void close() {
        System.out.println("No database connection to close just yet");
    }
}