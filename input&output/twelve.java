// Q12.Write a Java program to input a number and check whether it is a palindrome

import java.util.Scanner;
public class twelve {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num,temp=0;
        int rem=0,pal=0;
        System.out.println("Enter the given number to check : ");
        num=sc.nextInt();
        temp=num;
        while(num>0){
            rem=num%10;
            pal=rem+(pal*10);
            num=num/10;
        }
        if(temp==pal){
            System.out.println("Number is palinddrome...");
        }else{
            System.out.println("Number is not a palinddrome...");
        }
    }
    
}
