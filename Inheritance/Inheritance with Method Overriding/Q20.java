// 20.Create a class Bank with method interestRate(). Override it in different bank classes.

class Bank {
    void interestRate() {
        System.out.println("Generic bank interest rate...");
    }
}

class SBI extends Bank {
    @Override
    void interestRate() {
        System.out.println("SBI Interest Rate: 6.5%");
    }
}

class ICICI extends Bank {
    @Override
    void interestRate() {
        System.out.println("ICICI Interest Rate: 7.0%");
    }
}

class HDFC extends Bank {
    @Override
    void interestRate() {
        System.out.println("HDFC Interest Rate: 6.8%");
    }
}

public class Q20 {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        b.interestRate();

        b = new ICICI();
        b.interestRate();

        b = new HDFC();
        b.interestRate();
    }
}
