package com.example;

import com.example.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee  emp1 = new Employee(101, "Jane Smith", "012-34-4567", 1204365.27);
        System.out.println(emp1.getName());
    }
}
