// Write a Java program to find the reverse of a number.


import java.util.Scanner;

public class nine {
     public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int num,rev=0;
        System.out.println("Enter the given number : ");
        num=sc.nextInt();
        System.out.print("Revers of number is : ");
        for(;num>0;num=num/10){
            rev=num%10;
            System.out.print(rev);
        }
        
    }
}

