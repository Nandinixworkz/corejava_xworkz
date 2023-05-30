package com.xworkz.bankapp;

public class BankAccount {
    private double balance;
    public void credit(double amount){
        balance = amount+balance;
    }
    public void debit(double amount){
        balance =  balance - amount;
    }
    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void transfer(BankAccount beneficiaryAccount, double amount){

        this.debit(amount);
        beneficiaryAccount.credit(amount);
    }
}

