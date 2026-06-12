// 33. Write a program to show encapsulation in a Bank Account. 

import java.util.Scanner;

class BankAccount {
    // private data members
    private long accountNumber;
    private String holderName;
    private double balance;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setBalance(double balance) {
        if(balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance!");
        }
    }

    public long getAccountNumber() {
         return accountNumber; 
    }
    public String getHolderName() { 
        return holderName; 
    }
    public double getBalance() { 
        return balance; 
    }

    // deposit method
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // withdraw method
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // show account details
    public void showDetails() {
        System.out.println("===== Account Details =====");
        System.out.println("Holder Name   : " + holderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance       : Rs." + balance);
    }
}

public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        acc.setAccountNumber(1234567890L);
        acc.setHolderName("Anish Gupta");
        acc.setBalance(5000);

        acc.showDetails();

        acc.deposit(1500);
        acc.showDetails();

        acc.withdraw(2000);
        acc.showDetails();
    }
}

