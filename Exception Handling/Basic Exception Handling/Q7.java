// 7.Write a Java program to demonstrate the use of a finally block.


import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = sc.nextInt();

            int result = numerator / denominator;
            System.out.println("Result is: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Exception handled: " + e + " | Division by zero is not allowed.");
        } finally {
            System.out.println("Finally block executed: Closing resources.");
            sc.close();
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}