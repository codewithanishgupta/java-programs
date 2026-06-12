// 14.Create a BankAccount class with withdrawal validation. 

class BankAccount{
    private double balance;
    private String accountHolder;

    public BankAccount(String accountHolder , double balance) {
        this.accountHolder=accountHolder;
        this.balance=balance;
    }

    void deposit(double ammount){
        if(ammount>0){
            this.balance += ammount;
            System.out.println("Depisit successfully.......");
        }else{
            System.out.println("Invalid Deposit Ammount.");
        }
    }

    void withdrawal(double ammount){
        if(ammount>=0 && ammount<=balance){
            this.balance-=ammount;
            System.out.println("Withdraw Successfully.....");
        }
        else if(ammount>balance)
            System.out.println("Insufficient balance ");
        else
            System.out.println("Enter balanace positibe ..");
    }

    void acountDetails(){
        System.out.println("Account HolderName : "+accountHolder);
        System.out.println("Your Current balance : "+balance);
    }
}

public class Q14 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Anish Gupta", 100);
        b.acountDetails();
        b.deposit(200);
        b.acountDetails();
        b.withdrawal(250);
        b.acountDetails();
        b.withdrawal(234);
        b.acountDetails();
    }
}
