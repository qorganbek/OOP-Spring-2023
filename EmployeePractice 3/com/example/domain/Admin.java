package com.example.domain;
import com.example.Employee;

public class Admin extends Employee {
    public Admin(int empID, String name, String SSN, double salary) {
        super(empID, name, SSN, salary);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
