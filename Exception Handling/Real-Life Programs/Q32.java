// 32.Bank Management System using custom exceptions.  

class BankException extends Exception {

    public BankException(String message) {
        super(message);
    }

}

class BankAccount {
    String bankHolder;
    double balance;

    public BankAccount(String bankHolder, double balance) {
        this.bankHolder = bankHolder;
        this.balance = balance;
    }

    void deposit(double amount) throws BankException {
        if (amount <= 0) {
            throw new BankException("Invalid deposite amount : " + amount);
        } else {
            balance += amount;
            System.out.println("Deposited : " + amount + " Current balance : " + balance);
        }
    }

    void withdraw(double amount) throws BankException {
        if (amount <= 0) {
            throw new BankException("Invalid withdrawal amount: " + amount);
        } else if (amount > balance) {
            throw new BankException("Insufficient balance! Current Balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + balance);
        }
    }

    public void displayAccount() {
        System.out.println("Account Holder: " + bankHolder + " | Balance: " + balance);
    }
}

public class Q32 {
    public static void main(String[] args) {
        System.out.println("--------- Bank Management System ----------");

        BankAccount account = new BankAccount("Anish Gupta", 5000);

        account.displayAccount();

        try {
            account.deposit(2000);
            account.withdraw(1000);
            account.withdraw(7000);
        } catch (BankException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }

        try {
            account.deposit(-500);
        } catch (BankException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }

        account.displayAccount();
    }
}
