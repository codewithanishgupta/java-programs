// 27.Online Payment System using interfaces. 


interface OnlinePayment {
    void pay(double amount);
}

class CreditCardPay implements OnlinePayment {
    @Override
    public void pay (double amount){
        System.out.println("paid "+amount+" using CreditCard.");
    }
}

class DebitCardPay implements OnlinePayment {
    @Override
    public void pay( double amount){
        System.out.println("Paid "+amount+" using DebitCard.");
    }
}

class UPIPay implements OnlinePayment {
    @Override
    public void pay ( double amount ){
        System.out.println("Paid "+amount+" using UPI.");
    }
}

public class Q27 {
    public static void main(String[] args) {
        OnlinePayment p ;

        p = new CreditCardPay();
        p.pay(2000);

        p= new DebitCardPay();
        p.pay(27000);

        p= new UPIPay();
        p.pay(5000);
    }
}
