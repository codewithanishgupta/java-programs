// 1.Write a Java program to handle ArithmeticException (division by zero).

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numerator : ");
        int x = sc.nextInt();

        System.out.print("Enter a denominator : "); 
        int y = sc.nextInt();  

        try {
            int result = x/y;
            System.out.println("Result is : "+result);
        }
        catch(ArithmeticException e ){
            System.out.println("Exception Handled. | "+e);
        }

        System.out.println("Hellow guys...");
        sc.close();
    }
}