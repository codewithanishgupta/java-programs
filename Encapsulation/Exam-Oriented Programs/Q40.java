// 40. Write a program to protect account balance from unauthorized access.

class BankAccount {

    private double balance;
    private String holderName;

    public BankAccount(String holderName, double initialBalance) {
        this.holderName = holderName;
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
        System.out.println("Holder Name : " + holderName);
        System.out.println("Balance     : Rs." + balance);
    }
}

public class Q40 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Anish Gupta", 5000);

        acc.showDetails();

        acc.deposit(2000);
        acc.showDetails();

        acc.withdraw(3000);
        acc.showDetails();

        acc.withdraw(6000);
        acc.showDetails();

        // direct access not allowed 
        // acc.balance = 100000; // error because balance is private
    }
}
