// 25.Write a Java program to create class BankAccount and SavingsAccount using super.


class BankAccount{
    String accountHolder = new String();
    long accountNumber,blance;

    public BankAccount(String BH , long AN , long b) {
        this.accountHolder=BH;
        this.accountNumber=AN;
        this.blance=b;
    }
    void display(){
        System.out.println("Account Holder : "+accountHolder);
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Account Blance : "+blance);
    }

}
class SavingAccount extends BankAccount{
    double intrestRate;

    public SavingAccount(String BH , long AN , long b,double interestRate) {
        super( BH , AN , b);
        this.intrestRate=interestRate;
    }
    void display(){
        super.display();
        System.out.println(" IntrestRate  : "+intrestRate);
        double intrest=(blance*intrestRate)/100;
         System.out.println("Interest Earned: Rs. " + intrest);

    }
}

public class BankSavingAccount {
    public static void main(String[] args) {
        SavingAccount S=new SavingAccount("Anish Gupta", 17225211451l, 25000, 2.5);
        S.display();
    }
}
