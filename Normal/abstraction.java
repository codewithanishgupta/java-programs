abstract class Bank {
    protected double balance;   // corrected spelling
    protected int pass = 123;

    abstract void check();
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class Bank_Details extends Bank {
  
    void check() {
        System.out.println("Current Balance: " + balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

public class abstraction {
    public static void main(String[] args) {
        Bank_Details bd = new Bank_Details();
        bd.deposit(500);
        bd.check();
        bd.withdraw(200);
        bd.check();
    }
}