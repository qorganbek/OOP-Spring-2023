package com.example.domain;
import com.example.Employee;

public class Manager extends Employee {
    private String deptName;

    public Manager(int empID, String name, String SSN, double salary, String deptName) {
        super(empID, name, SSN, salary);
        this.deptName = deptName;
    }

    public String getDeptName(){
        return this.deptName;
    }

    @Override
    public String toString() {
        return super.toString() + "Department Name: " + this.deptName + "\n";
    }




//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
