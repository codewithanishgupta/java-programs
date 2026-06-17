// 22.Write a Java program to create an abstract class Payment and implement it in CreditCard, UPI, and NetBanking.

abstract class Payment{
    double balance;

    public Payment(double balance ) {
        this.balance = balance;
    }
     abstract void pay();
}

class CreditCard extends Payment {

    public CreditCard(double amount) {
        super(amount);
    }
    @Override
    void pay(){
        System.out.println("Paid "+balance+" using CreditCard");
    }
}

class UPI extends Payment {

    public UPI(double amount) {
        super(amount);
    }
    @Override
    void pay(){
        System.out.println("Paid "+balance+" UPI");
    }
}

class NetBanking extends Payment {

    public NetBanking(double amount) {
        super(amount);
    }
    @Override
    void pay() {
        System.out.println("Paid "+balance+" using NetBanking");
    }
}

public class Q22 {
    public static void main(String[] args) {
        Payment p1 = new CreditCard(2000);
        p1.pay();

        Payment p2 = new UPI(44000);
        p2.pay();

        Payment p3 = new NetBanking(2100);
        p3.pay();
    }
}
