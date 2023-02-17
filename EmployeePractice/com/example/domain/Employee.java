package com.example.domain;



public class Employee {
    private int empID;
    private String name;
    private String SSN;
    double salary;

    public int getEmpID() {
        return empID;
    }

    public String getName() {
        return name;
    }

    public String getSSN() {
        return SSN;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int ID, String Name, String Social_Security_Number, double Salary){
        this.empID = ID;
        this.name = Name;
        this.SSN = Social_Security_Number;
        this.salary = Salary;
    }
}
