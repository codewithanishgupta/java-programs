// 6.Write a Java program to demonstrate the use of try-catch.

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integers (numerator and denominator): ");
        int numerator = sc.nextInt();
        int denominator = sc.nextInt();

        try {
            int result = numerator / denominator;
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled: " + e + " | Division by zero is not allowed.");
        }

        System.out.println("Program continues after handling exception.");
        sc.close();
    }
}