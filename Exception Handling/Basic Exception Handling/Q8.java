// 8.Write a Java program that catches an exception and displays a custom error message.

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int numerator = sc.nextInt();

        System.out.print("Enter denominator: ");
        int denominator = sc.nextInt();

        try {
            int result = numerator / denominator;
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {

            System.out.println("Custom Error: Division by zero is not allowed. Please try again with a valid denominator.");
        }

        System.out.println("Program continues after handling exception.");
        sc.close();
    }
}