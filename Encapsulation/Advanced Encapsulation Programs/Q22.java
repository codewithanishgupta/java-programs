//  Create a Banking System with deposit, withdrawal, and balance inquiry. 

import java.util.Scanner;

class Bank{
    private double balance;

    void deposit(double amount){
        if(amount>0){
            this.balance+=amount;
            System.out.println("Deposite successful !....");
        }else {
            System.out.println("Amount must be greater than 0 !.");
        }
    }
    void withdrawal(double amount){
        if(amount>0 ){
            if(balance>=amount){
                this.balance-=amount;
                System.out.println("Withdraw successful. !");
            }else{
                System.out.println("Insufficient balance ! Enter valid amount .");
            }
        }else{
            System.out.println("Amount must be positive !.");
        }
    }
    double  checkBalance(){
        return balance;
    }
}


public class Q22 {
    public static void main(String[] args) {
        Bank b= new Bank();
        Scanner sc =new Scanner(System.in);
        int choice;
        do{
            System.out.println("Press 1 for deposite ");
            System.out.println("Press 2 for withdraw ");
            System.out.println("Press 3 for Check Balance ");
            System.out.println("Press 4 for Exit ...");
            System.out.print("Enter your choice : ");
            choice=sc.nextInt();
            switch(choice){
                case 1 :    System.out.print("Enter Amount : ");    b.deposit(sc.nextDouble());   break;
                case 2 :    System.out.print("Enter Amount : ");    b.withdrawal(sc.nextDouble()); break;
                case 3 :    System.out.println("Your balance is : "+b.checkBalance());  break;
                default :   System.out.println("Wrong Choice ! try again.....");
            }
        }while(choice != 4);    
    }
}
