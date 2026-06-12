// Q20.Write a Java program to input a year and check whether it is a leap year.


import java.util.Scanner;
public class twenty {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int year;
        System.out.print("Enter the given year : ");
        year=sc.nextInt();
        if((year%4==0 && year%100!=0) || year%400==0)
            System.out.println("Year is leap year...");
        else
            System.out.println("Given Year is not a leap Year...");

    }
    
}
