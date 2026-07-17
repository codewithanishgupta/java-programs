// 11.Write a Java program using nested try-catch blocks.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numerator : ");
            int n = sc.nextInt();
            System.out.print("Enter denominator : ");
            int d = sc.nextInt();
            try {
                int result = n / d;
                System.out.println("Result is : " + result);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero not allowed. | " + e);
            }
        } catch (InputMismatchException e) {
            System.out.println("please enter integer value  | " + e);
        }

        System.out.println("Program execute after nested try-catch...");
    }
}