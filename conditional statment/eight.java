// Q8.Write a Java program to check whether a number is a multiple of 3 and 7.

import java.util.Scanner;
public class eight {
    public static void main(String [] arg){
        Scanner sc= new Scanner(System.in);

        int num;
        System.out.println("Enter the given number : ");
        num=sc.nextInt();

        if(num%3==0 && num%7==0)
            System.out.println("Given number is multiple of 3 and 7...............");
        else
            System.out.println("Given number is not multiple of 3 and 7..............");
        
    }
}