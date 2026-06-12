// Q10.Write a Java program to input a number and check whether it is prime or not

import java.util.Scanner;
public class ten {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        long num,count=0;
        System.out.print("Enter the given number to check : ");
        num=sc.nextLong();
        for(int i=1;i<=num;i++){
             if(num%i==0){
                count++;
        }
        }
       if(count==2){
            System.out.println("Given number is prime...");
        }else{
            System.out.println("Given number is not prime...");

        }
        
    }
    
}
