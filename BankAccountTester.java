package com.xworkz.bankapp;
import com.xworkz.bankapp.*;
public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println("Current balance is before credit"+ bankAccount.getBalance());
        bankAccount.credit(5000.50);
        double totalBalance = bankAccount.getBalance();
        System.out.println("Balance Post Credit " +totalBalance);

        bankAccount.debit(2000.50);
        System.out.println("Balance Post debit " +bankAccount.getBalance());

        SavingAccount savingAccount = new SavingAccount(0.9);
        System.out.println("SavingAccount balance" +bankAccount.getBalance());
        savingAccount.credit(5000.00);
        savingAccount.getBalance();
        System.out.println("Balance Post debit " +savingAccount.getBalance());

        savingAccount.debit(4000.00);
        System.out.println("Balance post debit" +savingAccount.getBalance());

    }

   // public static void endOfMonth(SavingAccount account) {
     //   account.addPeriodicInterest();
    //}

}
