package com.example.domain;
import com.example.Employee;

public class Engineer extends Employee {
    public Engineer(int empID, String name, String SSN, double salary) {
        super(empID, name, SSN, salary);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
