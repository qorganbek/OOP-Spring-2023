package com.example.domain;

import com.example.Employee;

import java.util.List;

public class Manager extends Employee {
    private String deptName;
//    private List<Employee> staff;
//    private int employeeCount = 0;
//
//
//    public Manager findEmployee()


    public Manager(int empID, String name, String SSN, double salary, String deptName) {
        super(empID, name, SSN, salary);
//        if (employeeCount > 20){
//            return;
//        }
        this.deptName = deptName;
//        employeeCount++;
    }

    public String getDeptName(){
        return this.deptName;
    }

    @Override
    public String toString() {
        String s = "Hello my name is " +
                this.getName() +
                " my Social Safety Number " +
                this.getSSN() +
                " , And my salary " +
                this.getSalary() +
                " I work at department " + this.deptName;
        return s;
    }

}
