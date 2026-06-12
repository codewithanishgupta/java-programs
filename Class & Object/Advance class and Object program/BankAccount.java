// 21. Write a Java program to create class BankAccount with deposit and withdraw methods.

import java.util.Scanner;

public class BankAccount {
    Scanner sc= new Scanner(System.in);
    long accountN=0;
    int pass=9771,balance=0,w,d,p;
    void bankDetails(){
        System.out.println(".......State Bank Of India......");
        System.out.println("Branch Is panapur..");
    }

    BankAccount() {
    }
    void deposit(){
        System.out.print("Enter your Acountnumber : ");
        accountN=sc.nextLong();
        System.out.print("Enter your password : ");
        p=sc.nextInt();
        if(pass==p){
            System.out.print("Enter ammount to Deposit money : ");
            d=sc.nextInt();
            balance+=d;
            System.out.println("Deposit successfully");
        }else{
            System.out.println("Incorrect Password.....");
        }
    }
    void withdraw(){
        System.out.print("Enter your Acountnumber : ");
        accountN=sc.nextLong();
        System.out.print("Enter your password : ");
        p=sc.nextInt();
        if(pass==p){
            System.out.print("Enter ammount to Withdraw money : ");
            w=sc.nextInt();
            if (w <= balance) {
                 balance -= w;
                    System.out.println("Withdraw successfully");
            } else {
                System.out.println("Insufficient balance");
                }
        }else{
            System.out.println("Incorrect Password.....");
        }
    }
    void checkBlance(){
        System.out.print("Enter your Acountnumber : ");
        accountN=sc.nextLong();
        System.out.print("Enter your password : ");
        p=sc.nextInt();
        if(pass==p){
            System.out.println("Blance is : "+balance);
        }else{
            System.out.println("Incorrect pasword...");
        }
    }
    public static void main(String[] args) {
        BankAccount B=new BankAccount();
        int n;
        System.out.println("Press   1 for Bankdetails");
        System.out.println("        2 for Checkblance");
        System.out.println("        3 for Deposit");
        System.out.println("        4 for withdraw");
        System.out.println("        5 for exit");
        do { 
            System.out.print("Enter Your Choice : ");
            n=new Scanner(System.in).nextInt();
            
            switch(n){
                case 1 :    B.bankDetails();    break;
                case 2 :    B.checkBlance();    break;
                case 3 :    B.deposit();        break;
                case 4 :    B.withdraw();       break;
                case 5 :    break;
                default :   System.out.println("Enter vaild choice\n Try again....");   break;
            }
        } while (n!=5);
    }
}
