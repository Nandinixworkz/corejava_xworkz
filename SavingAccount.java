package com.xworkz.bankapp;
public class SavingAccount extends BankAccount {
    double balance;
    double interestRate;
    public SavingAccount(double interestRate, double minBalance){
        this.interestRate=interestRate;
        setBalance(minBalance);
    }
    public SavingAccount(double interestRate){

        this.interestRate=interestRate;
    }
    public void addPeriodicInterest() {
        double interest = (getBalance() * interestRate) / 100;
        this.credit(interest);
    }

    }


