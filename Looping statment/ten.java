// Write a Java program to find the sum of digits of a number.

import java.util.Scanner;

public class ten {
     public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int num,rem=0,sum=0;
        System.out.println("Enter the given number : ");
        num=sc.nextInt();
        for(;num>0;num=num/10){
            rem=num%10;
            sum=sum+rem;
        }
        
        System.out.println("Sumber of given number digit is : "+sum);
    }
}
    
