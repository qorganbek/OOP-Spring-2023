/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author hans
 */
public class CheckingAccount extends Account  {
    private final double overDraftLimit;

    CheckingAccount(double d, double overDraftLimit) {
         super(d);
         this.overDraftLimit = overDraftLimit;
    }

    public CheckingAccount(double b){
        this(b, 0);
    }

    @Override
    public boolean withdraw(double amount) {
        if(amount <= balance) {
                balance -= amount;
                return true;
            } else {
                return false;
            }
    }

    @Override
    public String getDescription(){
        return "Checking Account";
    }


    
}
