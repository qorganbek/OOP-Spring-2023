package com.example.domain;

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
        String s = "Hello my name is " +
                this.getName() +
                " my Social Safety Number " +
                this.getSSN() +
                " , And my salary " +
                this.getSalary() +
                " I work at department " + this.getDeptName()
                + " Department budget "
                + this.budget;
        return s;
    }

}
