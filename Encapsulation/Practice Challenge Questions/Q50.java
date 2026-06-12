// 50. Create a complete menu-driven Banking System using encapsulation.

import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String accountHolder, long accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        if(initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Invalid initial balance! Setting to 0.");
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void showDetails() {
        System.out.println("===== Account Details =====");
        System.out.println("Holder Name   : " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance       : Rs." + balance);
    }
}

public class Q50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount("Anish Gupta", 1234567890L, 5000);
        int choice;
        do {
            System.out.println("\n===== Banking Menu =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Show Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    acc.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    acc.withdraw(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("Current Balance: Rs." + acc.getBalance());
                    break;
                case 4:
                    acc.showDetails();
                    break;
                case 5:
                    System.out.println("Thank you for using Banking System!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while(choice != 5);

        sc.close();
    }
}

