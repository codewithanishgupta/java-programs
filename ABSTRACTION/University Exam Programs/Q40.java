// 40.Write a Java program to demonstrate real-world abstraction using a Bank Account system.

abstract class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void checkBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: Rs." + balance);
        System.out.println("---------------------------------------------");
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
            System.out.println("Deposited Rs." + amount + " in Savings Account.");
        }
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Rs." + amount + " from Savings Account.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest Rs." + interest + " added to Savings Account.");
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
            System.out.println("Deposited Rs." + amount + " in Current Account.");
        }
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn Rs." + amount + " from Current Account.");
        } else {
            System.out.println("Withdrawal exceeds overdraft limit!");
        }
    }
}

public class Q40 {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("Anish", 101, 10000);
        BankAccount current = new CurrentAccount("Lado", 102, 5000);

        savings.deposit(2000);
        savings.withdraw(3000);
        ((SavingsAccount) savings).addInterest();
        savings.checkBalance();

        current.deposit(4000);
        current.withdraw(12000); // overdraft allowed
        current.checkBalance();
    }
}
