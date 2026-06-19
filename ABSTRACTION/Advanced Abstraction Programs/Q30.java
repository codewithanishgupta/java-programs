// 30.Write a Java program to create a complete Banking Management System using abstraction.

import java.util.Scanner;

abstract class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    public BankAccount(String accoundHolder , int accountNumber , Double balance) {
        this.accountHolder = accoundHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void deposit (double ammount);
    abstract void withdraw (double ammount);
    
    void checkBalance (){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
     double interestRate = 0.04;

    public SavingsAccount(String accountHolder, int accountNumber, double balance) {
        super(accountHolder, accountNumber, balance);
    }

    @Override
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of " + interest + " added.");
    }
}

class CurrentAccount extends BankAccount {
    double overdraftLimit = 5000;

    public CurrentAccount(String accountHolder, int accountNumber, double balance) {
        super(accountHolder, accountNumber, balance);
    }

    @Override
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Withdrawal exceeds overdraft limit!");
        }
    }
}

public class Q30 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        BankAccount acc1 = new SavingsAccount("Anish", 101, 10000);
        BankAccount acc2 = new CurrentAccount("Lado", 102, 5000);

        int choice;
        
        do {
            System.out.println("\n===== Banking Management System =====");
            System.out.println("1. Deposit (Savings)");
            System.out.println("2. Withdraw (Savings)");
            System.out.println("3. Check Balance (Savings)");
            System.out.println("4. Add Interest (Savings)");
            System.out.println("5. Deposit (Current)");
            System.out.println("6. Withdraw (Current)");
            System.out.println("7. Check Balance (Current)");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: System.out.print("Enter amount: "); acc1.deposit(sc.nextDouble()); break;
                case 2: System.out.print("Enter amount: "); acc1.withdraw(sc.nextDouble()); break;
                case 3: acc1.checkBalance(); break;
                case 4: ((SavingsAccount)acc1).addInterest(); break;
                case 5: System.out.print("Enter amount: "); acc2.deposit(sc.nextDouble()); break;
                case 6: System.out.print("Enter amount: "); acc2.withdraw(sc.nextDouble()); break;
                case 7: acc2.checkBalance(); break;
                case 8: System.out.println("Exiting Banking System..."); break;
                default: System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 8);
    }
}
