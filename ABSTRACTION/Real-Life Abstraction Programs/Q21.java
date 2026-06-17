// 21.Write a Java program to create an abstract class ATM with methods withdraw() and deposit().

abstract class ATM {
    double balance;

    public ATM(double balance) {
        this.balance = balance;
    }

    abstract void withdraw(double amount);
    abstract void deposit(double amount);
    
    void displayBalance(){
        System.out.println("Balance is : "+balance);
    }
}

class SBIATM extends  ATM {

    public SBIATM(double balance ) {
        super(balance);
    }

    @Override
    void withdraw(double amount){
        if(amount > 0){
            if(amount <= balance){
                balance -= amount;
                System.out.println("Withdraw Successfull.....");
            }else{
                System.out.println("Insufficient Balance...");
                System.out.println("your balance is : "+balance);
            }
        }else{
            System.out.println("Amount must be Positive...");
        }
    }

    @Override
    void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }    
}
public class Q21{
    public static void main(String[] args) {
        SBIATM atm = new SBIATM(2000);
        atm.displayBalance();
        atm.withdraw(5000);
        atm.displayBalance();
        atm.deposit(1000);
        atm.displayBalance();
        atm.withdraw(2000);
        atm.displayBalance();
    }
}