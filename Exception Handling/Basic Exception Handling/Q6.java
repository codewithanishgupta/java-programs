// 6.Write a Java program to demonstrate multiple catch blocks.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator : ");
            int x = sc.nextInt();
            System.out.print("Enter denuminator : ");
            int y = sc.nextInt();

            int result = x / y;

            System.out.println("Result is : " + result);

        } catch (ArithmeticException e) {
            System.out.println("Exception Handled : " + e + " Division by zero not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Exception handled : " + e + " Please Enter valid integer.");
        } catch (Exception e) {
            System.out.println("General Exceptyion Handeld : " + e);
        }

        System.out.println("Program continues after handling exception...");
    }
}
