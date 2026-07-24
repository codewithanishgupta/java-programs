// 4. Create a package calculator containing methods for addition, subtraction, multiplication, and division.

import calculator.Calculator;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number : ");
        int x = sc.nextInt();
        System.out.println("Enter Second number : ");
        int y = sc.nextInt();

        Calculator c = new Calculator();
        System.out.println("addition is : "+c.addition(x, y));
        System.out.println("subtraction is : "+c.subtraction(x, y));
        System.out.println("multiplication is : "+c.multiplication(x, y));
        System.out.println("division is : "+c.division(x, y));

    }
}
