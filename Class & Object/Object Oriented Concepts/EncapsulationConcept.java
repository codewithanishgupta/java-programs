// 16. Write a Java program to demonstrate encapsulation using private
//  variables and getter/setter.

import java.util.Scanner;

class bank{
    private Scanner sc= new Scanner(System.in);
    private String BankName = "State Bank Of India";
    private int diposit,withdraw,blance=0,password=9771,pass;

    public void Bankdetails(){
        System.out.println("Name    : "+BankName);
        System.out.println("Branch  : Nariyar panapur muz.");
    }
    public void checkBlace(){
        System.out.print("Enter your password : ");
        pass=sc.nextInt();
        if(pass == password){
            System.out.println("Your blance is : "+blance);
        }else{
            System.out.println("Incorrect Password........");
        }
    }
    public void Diposit(){
        System.out.print("Enter your password : ");
        pass=sc.nextInt();
            if(pass == password){
                System.out.println("Enter the amount To Diposit    : ");
                diposit=sc.nextInt();
                blance=blance+diposit;
                System.out.println("Diposit successfully......");
            }else{
                System.out.println("Incorrect Password.......\n try again.");
            }       
    }
    public void Withdraw (){
        System.out.print("Enter your password : ");
        pass=sc.nextInt();           
           if(pass == password){

               System.out.println("Enter the amount To withdraw    : ");
               withdraw=sc.nextInt();
               blance=blance-withdraw;
               System.out.println("Withraw successfully......");
           }else{

               System.out.println("Incorrect Password.......\n try again.");
           }     
    }
}

    
class EncapsulationConcept {
    public static void main(String[] args) {
        bank b=new bank();
        int n,i=0;
        do { 
            
            System.out.print("Press 1 for bank details... \npress 2 for check blance ...\npress 3 for withdraw money...\nPress 4 for Diposit money... \nPress 5 for Exit : ");
            n=new Scanner(System.in).nextInt();
    
                    
                    switch(n){
                        case 1 : b.Bankdetails();    break;
                        case 2 : b.checkBlace();    break;
                        case 3 : b.Withdraw();      break;
                        case 4 : b.Diposit();       break;
                        case 5 : System.out.println("Exit successfully"); break;
                        default : System.out.println("Enter vaild Number... try again"); i++;
                    }
        } while (n!=5);
    }
}