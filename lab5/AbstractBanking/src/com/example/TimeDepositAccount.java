package com.example;

import java.util.Date;

public class TimeDepositAccount extends Account {
    private final Date maturityDate;

    public TimeDepositAccount(double balance, Date maturityDate) {
        super(balance);
//        this.balance = balance;
        this.maturityDate = maturityDate;
    }

    
    @Override
    public String toString() {
        return getDescription() + ": current balance is " + balance;
    }

    @Override
    public boolean withdraw(double amount) {
        return false;
    }


    public String getDescription() {
        return "Time Deposit Account " + maturityDate;
    }
    
}