// 15. Create a class BankAccount and derive:SavingAccount ,CurrentAccount Implement account features.

class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

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

    void displayAccount() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    double interestRate;

    void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
}

class CurrentAccount extends BankAccount {
    double overdraftLimit;

    @Override
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn (with overdraft if needed): " + amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

public class Q15 {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.accountHolder = "Anish";
        sa.accountNumber = 1001;
        sa.balance = 5000;
        sa.interestRate = 5;
        sa.displayAccount();
        sa.addInterest();
        sa.displayAccount();

        System.out.println();

        CurrentAccount ca = new CurrentAccount();
        ca.accountHolder = "Simmu";
        ca.accountNumber = 2001;
        ca.balance = 3000;
        ca.overdraftLimit = 2000;
        ca.displayAccount();
        ca.withdraw(4500); // within overdraft limit
        ca.displayAccount();
        ca.withdraw(6000); // exceeds overdraft
    }
}
