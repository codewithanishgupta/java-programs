// Q9.Write a Java program to check whether a number is a palindrome or not.

import java.util.Scanner;

public class nine {
    public static void main(){
        Scanner sc= new Scanner(System.in);

        int num,temp=0,r=0,pal=0;

        System.out.println("Enter the Given number is : ");
        num=sc.nextInt();
        temp=num;
        while(temp>0)
        {
            r=temp%10;
            pal=r+(pal*10);;
           temp=temp/10;
        }
        if(num==temp)
            System.out.println("The Given number is Palindrome...........");
        else
            System.out.println("The Given number is not a Palindrome......");

    }
    
}
