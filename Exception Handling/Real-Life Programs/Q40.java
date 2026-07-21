// 40.Mobile Recharge System with exception handling.

class RechargeException extends Exception {
    public RechargeException(String message) {
        super(message);
    }
}

class MobileRecharge {
    private String mobileNumber;
    private String operator;
    private double balance;

    public MobileRecharge(String mobileNumber, String operator, double balance) throws RechargeException {
        if (mobileNumber == null || mobileNumber.length() != 10) {
            throw new RechargeException("Invalid mobile number. Must be 10 digits.");
        }
        if (operator == null || operator.trim().isEmpty()) {
            throw new RechargeException("Operator cannot be empty.");
        }
        if (balance < 0) {
            throw new RechargeException("Initial balance cannot be negative.");
        }

        this.mobileNumber = mobileNumber;
        this.operator = operator.trim();
        this.balance = balance;
    }

    public void recharge(double amount) throws RechargeException {
        if (amount <= 0) {
            throw new RechargeException("Recharge amount must be greater than 0.");
        }
        if (amount > balance) {
            throw new RechargeException("Insufficient balance. Current balance: ₹" + balance);
        }

        balance -= amount;
        System.out.println("Recharge successful! Mobile: " + mobileNumber + " | Operator: " + operator + " | Amount: Rs. " + amount + " | Remaining balance: Rs. " + balance);
    }

    public void displayInfo() {
        System.out.println("Mobile: " + mobileNumber + " | Operator: " + operator + " | Balance: Rs. " + balance);
    }
}

public class Q40 {
    public static void main(String[] args) {
        System.out.println("--------- Mobile Recharge System ----------");

        try {
            MobileRecharge user1 = new MobileRecharge("9876543210", "Jio", 1000);
            user1.displayInfo();

            user1.recharge(200);   
            user1.recharge(1200); 

        } catch (RechargeException e) {
            System.out.println("Exception Handled: " + e.getMessage());
        }

        try {
            MobileRecharge user2 = new MobileRecharge("12345", "Airtel", 500); 
            user2.displayInfo();
        } catch (RechargeException e) {
            System.out.println("Exception Handled: " + e.getMessage());
        }

        try {
            MobileRecharge user3 = new MobileRecharge("9876543211", "", 300); 
            user3.displayInfo();
        } catch (RechargeException e) {
            System.out.println("Exception Handled: " + e.getMessage());
        }
    }
}
