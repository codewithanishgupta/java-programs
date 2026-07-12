// 17.Create a class Payment with method pay(). Override it in:CreditCard,DebitCard,UPI 

abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }
    abstract void pay();
}

class CreditCard extends Payment {
    String cardNumber;

    CreditCard(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void pay() {
        System.out.println("Paid ₹" + amount + " using Credit Card (Card No: " + cardNumber + ")");
    }
}

class DebitCard extends Payment {
    String cardNumber;

    DebitCard(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void pay() {
        System.out.println("Paid ₹" + amount + " using Debit Card (Card No: " + cardNumber + ")");
    }
}

class UPI extends Payment {
    String upiId;

    UPI(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void pay() {
        System.out.println("Paid ₹" + amount + " using UPI (UPI ID: " + upiId + ")");
    }
}

public class Q17{
    public static void main(String[] args) {
        // Runtime polymorphism
        Payment p;

        p = new CreditCard(2500.50, "1234-5678-9876-5432");
        p.pay();

        p = new DebitCard(1500.00, "9876-5432-1234-5678");
        p.pay();

        p = new UPI(500.75, "anish@upi");
        p.pay();
    }
}