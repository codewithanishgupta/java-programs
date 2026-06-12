// Write a Java program to count the digits in a number.

import java.util.Scanner;

public class eight {
     public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int num ,c=0;
        System.out.println("Enter the given number : ");
        num=sc.nextInt();
        for(int i=num;num>0;num=num/10){
            c++;
        }
        System.out.println("Number of digit is : "+c);
    }
}
    
