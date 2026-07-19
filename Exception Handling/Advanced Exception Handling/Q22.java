// 22.Write a Java program to create an ATM Withdrawal system using exception handling.

class WithdrawalException extends Exception {

    public WithdrawalException(String message) {
        super(message);
    }

}

class ATM {
    double balance;
    int pin;

    public ATM(double balance, int pin) {
        this.balance = balance;
        this.pin = pin;
    }

    void withdraw(double amount, int pass) throws WithdrawalException {
        if (pin == pass) {
            if (amount < 0) {
                throw new WithdrawalException(" Withdraw Amount can not be negative. ");
            } else if (amount > balance) {
                throw new WithdrawalException("Insufficient balance... | Available balance is : " + balance);
            } else {
                balance -= amount;
                System.out.println("Withdrawal successfully.. | Amount Is : " + balance);
            }
        } else {
            throw new WithdrawalException("Wrong Password...");
        }
    }
}

public class Q22 {
    public static void main(String[] args) {
        System.out.println("--------- ATM System ---------- ");

        ATM atm = new ATM(6700, 1234);
        try {
            atm.withdraw(8000, 1234);               // max amount
        } catch (WithdrawalException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }

        try {
            atm.withdraw(2000, 1111);               // wrong pin
        } catch (WithdrawalException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }

        try {
            atm.withdraw(-500, 1234);                       // negative amount
        } catch (WithdrawalException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
        
        try { 
            atm.withdraw(600, 1234);                // all right
        } catch (WithdrawalException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }

    }
}