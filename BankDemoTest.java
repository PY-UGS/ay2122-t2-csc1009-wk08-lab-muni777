package com.Munigal.lab8;
import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[] args) {
        CheckingAccount myAccount = new CheckingAccount(100, "269-189-001");
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter amount you wish to deposit: ");
            double depositAmt = input.nextDouble();
            myAccount.deposit(depositAmt);

            System.out.println("Enter amount you wish to withdraw: ");
            double withdrawnAmt = input.nextDouble();
            myAccount.withdraw(withdrawnAmt);
            System.out.println("Balance available: $" + myAccount.getBalance());

        } catch (InsufficientFundsException e) {
            System.out.println("Sorry but your account is short by: $" + (e.getAmount()));
        }
    }
}
