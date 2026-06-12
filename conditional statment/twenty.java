// Q20.Write a Java program to create a menu-driven program using switch.

import java.util.Scanner;

public class twenty {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // Display menu
            System.out.println("\n=== MENU ===");
            System.out.println("1. Add two numbers");
            System.out.println("2. Find factorial");
            System.out.println("3. Check even/odd");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();
                    System.out.println("Sum = " + (a + b));
                    break;

                case 2:
                    System.out.print("Enter a number: ");
                    int n = sc.nextInt();
                    int fact = 1;
                    for (int i = 1; i <= n; i++) {
                        fact *= i;
                    }
                    System.out.println("Factorial = " + fact);
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    if (num % 2 == 0) {
                        System.out.println(num + " is Even");
                    } else {
                        System.out.println(num + " is Odd");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }

    
}
