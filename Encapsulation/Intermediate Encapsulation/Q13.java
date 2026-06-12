// 13.Create a BankAccount class with private balance and methods to deposit money. 

import java.util.Scanner;

class BankAccount{
    private double balance;

    void deposit(double balance){
        if(balance > 0){
            this.balance+=balance;
        }else {
            System.out.println("Money must be positive..");
        }
    }
    double getBalance(){
        return balance;
    }
}

public class Q13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        BankAccount b1 = new BankAccount();
        System.out.print("How many balance are deposit : ");
        b1.deposit(sc.nextDouble());
        b1.deposit(200);
        System.out.println("Balance is : "+b1.getBalance());
    }
}
