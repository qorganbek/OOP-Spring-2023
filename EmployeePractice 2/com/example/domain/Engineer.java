package com.example.domain;

import com.example.Employee;

public class Engineer extends Employee {


    public Engineer(int empID, String name, String SSN, double salary) {
        super(empID, name, SSN, salary);
    }


    @Override
    public String toString() {
        String s = "Hello my name is "
                + this.getName()
                + " my Social Safety Number "
                + this.getSSN()
                + " , And my salary "
                + this.getSalary();
        return s;
    }
}
