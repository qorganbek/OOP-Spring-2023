package com.example.domain;

import java.text.NumberFormat;

public class Director extends Manager {
    private double budget;
    public Director(int empID, String name, String SSN, double salary, String deptName, double budget) {
        super(empID, name, SSN, salary, deptName);
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }

    public void setBudget(double budget){
        this.budget = budget;
    }

    @Override
    public String toString() {
        return super.toString() + "Budget: " + NumberFormat.getCurrencyInstance().format(this.budget) + "\n";
    }
}
