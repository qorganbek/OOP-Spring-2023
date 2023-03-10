package com.example;

import java.util.Objects;
import java.text.NumberFormat;
public class Employee {
    private int empID;
    private String name;
    private String SSN;
    private double salary;

    public Employee(int empID, String name, String SSN, double salary){
        this.empID = empID;
        this.name = name;
        this.SSN = SSN;
        this.salary = salary;
    }

    public void setName(String name) {
        if (Objects.equals(name, "") || name == null){
            System.out.println("Error 404!");
            return;
        }
        this.name = name;
    }

    public void raiseSalary(double number) {
        if(number > 0) return;

        this.salary += number;
    }





    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        String s = "Hello my name is "
                + this.name
                + " my Social Safety Number "
                + this.SSN
                + " , And my salary "
                + this.salary;
        return s;
    }
}
