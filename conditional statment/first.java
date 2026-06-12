// Q1. Write a Java program to check whether a number is positive or negative.


import java.util.Scanner;
public class first {
    public static void main(String [] arg){
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Enter the given number :" );
        num=sc.nextInt();

        if(num>=0)
            System.out.println("Given number is positive....");
        else
            System.out.println("Given number is negative....");
        
    }
}