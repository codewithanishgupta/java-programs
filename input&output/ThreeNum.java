
// Q.   Write a Java program to input three numbers and find the largest number.

import java.util.Scanner;
public class ThreeNum {
    public static void main (String arg[]){
        int a,b,c,larg=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1St Number : ");
        a=sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        b=sc.nextInt();
        System.out.print("Enter 3St Number : ");
        c=sc.nextInt();
        larg=(a>b)?((a>c)?a:c):(b>c?b:c);
        System.out.println("Largest number is : "+larg);
    }
    
}
