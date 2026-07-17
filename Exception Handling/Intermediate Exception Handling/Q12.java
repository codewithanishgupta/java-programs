// 12.Write a Java program to demonstrate multiple exceptions in a single program.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numerator : ");
            int n = sc.nextInt();
            System.out.print("Enter denuminator : ");
            int d = sc.nextInt();

            int result = n / d;
            System.out.println("Result is " + result);

            String name = "Anish";
            System.out.println("In string char at index 7 is : " + name.charAt(7));

        } catch (InputMismatchException e) {
            System.out.println("Please enter integer value. | " + e);
        } catch (ArithmeticException e) {
            System.out.println("Division not possible by zero. | " + e);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Ivvalid index accessed. |" + e);
        } catch (Exception e) {
            System.out.println("General exception handled. | " + e);
        }

        System.out.println("Programe continues after exception handled...");
    }
}
