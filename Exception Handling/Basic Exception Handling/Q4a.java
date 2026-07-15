// 5.Write a Java program to handle InputMismatchException using Scanner.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4a {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        try {           
            int x= sc.nextInt();
            System.out.println("Number is : "+x);
        } catch (InputMismatchException e) {
            System.out.println("Exception Handled : "+e+" Please Enter valid integer. ");
        }
        System.out.println("Program continues after Exception handling...");
    }
}
