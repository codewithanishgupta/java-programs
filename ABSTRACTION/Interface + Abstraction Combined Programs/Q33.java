// 33.Write a Java program to create a payment gateway using interfaces and abstract classes.

interface Transaction {
    void processPayment (double amount);
    void refund ( double amount );
}

abstract class PaymentGateway implements Transaction {
    String gatewayName ;

    public PaymentGateway(String gatewayName) {
        this.gatewayName = gatewayName ;
    }

    abstract void validateDetails ();
    void showGatewayInfo(){
        System.out.println("Using Payment Gateway: " + gatewayName);
    }  
}

class CreditCardPayment extends PaymentGateway {
    String cardNumber ;

    public CreditCardPayment(String gatewayName , String cardName ) {
        super(gatewayName);
        this.cardNumber = cardName;
    }

    @Override
    void validateDetails (){
        System.out.println("Validating credit card : "+cardNumber);
    }
    @Override
    public void processPayment (double amount ){
        System.out.println("Processing Cradit card Payment of Rs. : "+amount);
    }
    @Override
    public void refund (double amount ){
        System.out.println("Refunding Rs. "+amount+" to Credit Card.");
    }    
}

class UPIPayment extends PaymentGateway {
    String upiId;

    public UPIPayment(String gatewayName , String upiId) {
        super(gatewayName);
        this.upiId = upiId ;
    }
    @Override
    void validateDetails (){
        System.out.println("Validating UPI Id : "+upiId);
    }
    @Override
    public void processPayment(double amount ){
        System.out.println("Processing UPI id Payment of Rs. : "+amount);
    }
    @Override
    public void refund (double amount){
        System.out.println("Refunding Rs." + amount + " via UPI.");
    }
}

class NetBankingPayment extends PaymentGateway {
    String accountNumber;

    public NetBankingPayment(String gatewayName, String accountNumber) {
        super(gatewayName);
        this.accountNumber = accountNumber;
    }

    @Override
    void validateDetails() {
        System.out.println("Validating NetBanking Account: " + accountNumber);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing NetBanking payment of Rs." + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding Rs." + amount + " via NetBanking.");
    }
}

public class Q33 {
    public static void main(String[] args) {
        PaymentGateway cc = new CreditCardPayment("RazorPay", "1234-5678-9876");
        cc.showGatewayInfo();
        cc.validateDetails();
        cc.processPayment(5000);
        cc.refund(2000);
        System.out.println("-----------------------------------------------------------------");
        PaymentGateway upi = new UPIPayment("Paytm Gateway", "anish@upi");
        upi.showGatewayInfo();
        upi.validateDetails();
        upi.processPayment(1200);
        upi.refund(500);
        System.out.println("-----------------------------------------------------------------");
        PaymentGateway nb = new NetBankingPayment("HDFC Gateway", "ACC12345");
        nb.showGatewayInfo();
        nb.validateDetails();
        nb.processPayment(2500);
        nb.refund(1000);
    }
}
