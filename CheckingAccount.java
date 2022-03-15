package com.Munigal.lab8;
public class CheckingAccount extends Exception {
    private double balance;
    private String accountNumber;

    public CheckingAccount(double balance, String accountNumber){
        this.balance = balance;
        this.accountNumber=accountNumber;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if (balance < amount){
            throw new InsufficientFundsException(amount-balance);
        }
        else {
            balance -= amount; //withdraw successful
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getNumber() {
        return accountNumber;
    }

}
