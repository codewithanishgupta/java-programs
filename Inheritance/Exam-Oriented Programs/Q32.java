// 32.Write a Java program to create a banking system using inheritance.

class BankAccount {
    String accountHolder;
    double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void showBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
}

class CurrentAccount extends BankAccount {
    double overdraftLimit;

    public CurrentAccount(String accountHolder, double balance, double overdraftLimit) {
        super(accountHolder, balance); 
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

public class Q32 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("Anish", 10000, 5);
        sa.showBalance();
        sa.deposit(2000);
        sa.addInterest();
        sa.showBalance();

        System.out.println("-------------------");

        CurrentAccount ca = new CurrentAccount("Ganga ", 5000, 2000);
        ca.showBalance();
        ca.withdraw(6000);
        ca.showBalance();
        ca.withdraw(2000);
    }
}