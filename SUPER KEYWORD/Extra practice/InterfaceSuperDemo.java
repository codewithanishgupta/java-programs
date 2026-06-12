// 29. Use super in interface implementation scenario (indirect use)

interface Account {
    void accountType();
}

class BankAccount {
    String holder;
    double balance;

    public BankAccount(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    void display() {
        System.out.println("Holder : " + holder);
        System.out.println("Balance: Rs. " + balance);
    }
}

class SavingsAccount extends BankAccount implements Account {
    double interestRate;

    public SavingsAccount(String holder, double balance, double interestRate) {
        super(holder, balance); 
        this.interestRate = interestRate;
    }

    @Override
    public void accountType() {
        System.out.println("This is a Savings Account.");
    }

    void showDetails() {
        super.display();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class InterfaceSuperDemo {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("Anish Gupta", 25000, 3.5);
        sa.accountType();
        sa.showDetails();
    }
}
