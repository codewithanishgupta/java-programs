// 10.Create an interface Payment with method pay(double amount). Implement it using CreditCard, DebitCard, and UPI. 

interface Payment {
    void pay ( double amount );
}

class CreditCard implements Payment {
    @Override
    public void pay (double amount){
        System.out.println("Paid "+amount+ "Using Credit Card");
    }
}

class DebitCard implements Payment {
    @Override
    public void pay (double amount){
        System.out.println("Paid "+amount+ "Using Debit Card");
    }
}

class UPI implements Payment {
    @Override
    public void pay (double amount){
        System.out.println("Paid "+amount+ "Using UPI");
    }
}

public class Q10 {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new DebitCard();
        Payment p3 = new UPI();

        p1.pay(1500);
        p2.pay(2500);
        p3.pay(500);
    }
}
