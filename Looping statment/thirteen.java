// Write a Java program to check whether a number is a palindrome.

import java.util.Scanner;

public class thirteen {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int num,temp,rem=0,pal=0;
        System.out.println("Enter the given number to check : ");
        num=sc.nextInt();
        temp=num;
        for(;num>0;num=num/10){
            rem=num%10;
            pal=(pal*10)+rem;
        }
        if(pal==temp)
            System.out.println("the given number is palindrome number ...");
        else
            System.out.println("Given number is not a palindrome number ....");
    }
}
