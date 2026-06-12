// Q6.Write a Java program to check whether a year is a leap year or not.

import java.util.Scanner;
public class six {
    public static void main(String [] arg){
        Scanner sc= new Scanner(System.in);
        long year;
        System.out.println("Enter the given year : ");
        year=sc.nextLong();

        if((year%4==0 && year%100==0) || year%400==0)
            System.out.println("The given year is leap year.........");
        else
            System.out.println("The Given year is not a leap year.........");
        
    }
}