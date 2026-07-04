// 24.Write a Java program to create a banking system using interfaces. 


interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}

class SBI implements Bank {
    private double balance;

    public SBI(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in SBI. Current Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from SBI. Current Balance: " + balance);
        } else {
            System.out.println("Insufficient balance in SBI!");
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}

class HDFC implements Bank {
    private double balance;

    public HDFC(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in HDFC. Current Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from HDFC. Current Balance: " + balance);
        } else {
            System.out.println("Insufficient balance in HDFC!");
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}

public class Q24 {
    public static void main(String[] args) {
        Bank sbi = new SBI(5000);
        sbi.deposit(2000);
        sbi.withdraw(3000);
        System.out.println("Final SBI Balance: " + sbi.checkBalance());

        System.out.println();

        Bank hdfc = new HDFC(10000);
        hdfc.deposit(5000);
        hdfc.withdraw(12000);
        System.out.println("Final HDFC Balance: " + hdfc.checkBalance());
    }
}
