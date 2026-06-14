// 9.Write a Java program to create an abstract class Account with methods deposit()           and withdraw().


abstract  class Account {
    String holderName;
    double balance;
    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    public Account(String holderName , double  balance) {
        this.holderName = holderName;
        this.balance = balance;
    }
    

    void display(){
        System.out.println("Account Holder : "+holderName);
        System.out.println("Balance : "+balance);
    }
}

class SavingsAccount extends Account {

    public SavingsAccount() {
        super("Anish Gupta", 234800);
    }

    void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposite successfully......");
        }else{
            System.out.println("Invalid Amount! must be positive.");
        }
    }
    
    void withdraw(double amount){
        if(amount>0){
            if(amount <= balance){
                balance -= amount;
                System.out.println("Withdraw successfuly...");
            }else{
                System.out.println("Please Enter suficient amount...");
                System.out.println("Your balance is "+balance);
            }
        }else{
            System.out.println("Invalid Amount! Must be positive..");
        }
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;

    public CurrentAccount(double overdraftLimit) {
        super("Simran jha", 56000);
        this.overdraftLimit=overdraftLimit;
    }

    void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposite successfully......");
        }else{
            System.out.println("Invalid Amount! must be positive.");
        }
    }
    
    void withdraw(double amount){
        if(amount>0){
            if(amount <= balance + overdraftLimit){
                balance -= amount;
                System.out.println("Withdraw successfuly ((Overdraft allowed))...");
            }else{
                System.out.println("Please Enter suficient amount...");
                System.out.println("You withdraw balance under Rs. : "+balance+overdraftLimit);
            }
        }else{
            System.out.println("Invalid Amount! Must be positive..");
        }
    }
}

public class Q9 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.display();
        s.deposit(5000);
        s.display();
        s.withdraw(22000);
        s.display();
        System.out.println("-----------------------------");
        CurrentAccount c = new CurrentAccount(40000);
        c.deposit(3000);
        c.display();
        c.display();
        c.withdraw(6000);
        c.display();
    }
}
