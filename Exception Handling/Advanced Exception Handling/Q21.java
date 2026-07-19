// 21.Write a Java program to create a Bank Account application that throws an exception for insufficient balance.

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    String holderName;
    int accountNumber;
    double balance;
    int password = 1234;

    public BankAccount(String holderName, int accountNumber, double balance) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void checkBlance(int pass) {
        if (password == pass) {
            System.out.println("Blance is : " + balance);
        } else {
            System.out.println("Wrong Password...");
        }
    }

    void deposite(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposite successfull...");
        } else {
            System.out.println("Amount must be positive.");
        }
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new InsufficientBalanceException("Withdrawal amount cannot be negative.");
        } else if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance. Available: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdraw successfully...");
        }
    }
}

public class Q21 {
    public static void main(String[] args) {
        BankAccount B = new BankAccount("Anish Gupta", 1243567823, 4500);

        B.checkBlance(1234);
        try {

            B.withdraw(5600.2);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception handled : " + e);
        }
        B.deposite(2345);

    }
}