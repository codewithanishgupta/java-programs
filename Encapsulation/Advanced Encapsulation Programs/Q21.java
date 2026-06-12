// 21. Create an ATM system using encapsulation

import java.util.Scanner;

class ATM {
    private double balance;
    private int pwd = 1234;

    private boolean validatePin(int pass) {
        return pwd == pass;
    }

    void checkBalance(int pass) {
        if (validatePin(pass))
            System.out.println("Your balance : " + balance);
        else
            System.out.println("Wrong card number !");
    }

    void deposit(double amount, int pass) {
        if (validatePin(pass)) {
            if (amount > 0) {
                this.balance += amount;
                System.out.println("Deposit successful!");
            } else {
                System.out.println("Amount must be positive.");
            }
        } else {
            System.out.println("Wrong card number !");
        }
    }

    void withdraw(double amount, int pass) {
        if (validatePin(pass)) {
            if (amount > 0 && amount <= balance) {
                this.balance -= amount;
                System.out.println("Withdraw successful!");
            } else {
                System.out.println("Invalid or insufficient balance.");
            }
        } else {
            System.out.println("Wrong card number !");
        }
    }
}

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM a = new ATM();

        System.out.print("Enter your card number (PIN): ");
        int pin = sc.nextInt();

        System.out.print("Enter amount to deposit: ");
        a.deposit(sc.nextDouble(), pin);

        System.out.print("Enter amount to withdraw: ");
        a.withdraw(sc.nextDouble(), pin);

        a.checkBalance(pin);
    }
}
