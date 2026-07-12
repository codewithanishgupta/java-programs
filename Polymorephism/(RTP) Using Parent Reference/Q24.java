// 24.Write a program using parent reference to access different bank classes.

class Bank {
    void interestRate() {
        System.out.println("Bank provides interest rate...");
    }
}

class SBI extends Bank {
    @Override
    void interestRate() {
        System.out.println("SBI interest rate: 6.5%");
    }
}

class HDFC extends Bank {
    @Override
    void interestRate() {
        System.out.println("HDFC interest rate: 7.0%");
    }
}

class ICICI extends Bank {
    @Override
    void interestRate() {
        System.out.println("ICICI interest rate: 6.8%");
    }
}

public class Q24 {
    public static void main(String[] args) {
        // Parent reference
        Bank b;

        b = new SBI();
        b.interestRate();

        b = new HDFC();
        b.interestRate();

        b = new ICICI();
        b.interestRate();
    }
}