package com.xworkz.bankapp;

public class SavingAccountTester {
    public static void main(String[] args) {

        SavingAccount savingAccount = new SavingAccount(2.5);
        //  System.out.println("SavingAccount balance" +savingAccount.getBalance());
        //savingAccount.addPeriodicInterest();
        savingAccount.credit(100.00);
        savingAccount.addPeriodicInterest();
        System.out.println("Balance Post debit " + savingAccount.getBalance());
        endOfMonth(savingAccount);
        savingAccount.getBalance();
        System.out.println("Balance Post debit " + savingAccount.getBalance());

    }
   public static void endOfMonth(SavingAccount account) {
        account.addPeriodicInterest();

    }
}


