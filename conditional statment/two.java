// Q2.Write a Java program to check whether a number is even or odd.

import java.util.Scanner;
public class two {
    public static void main(String [] arg){
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Enter thre given number : ");
        num=sc.nextInt();
        if(num%2==0)
            System.out.println("Number is even....");
        else
            System.out.println("number is odd");
    }
}