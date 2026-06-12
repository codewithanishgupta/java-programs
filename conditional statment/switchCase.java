/*
Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.

*/

import java.util.*;

public class switchCase {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a=sc.nextInt();
        System.out.print("Enter Seond number : ");
        int b= sc.nextInt();
        System.out.println("You Enter first numberb : "+(a));
        System.out.println("You Enter second numberb : "+(b));
    
        System.out.print("Press 1 for Add\n   2 for sub\n 3 for Mul\n 4 for divide\n  5 for Modul :");
        int n=sc.nextInt();
        System.out.print("Result is : ");
        switch(n){
            case 1 :    System.out.println(a+b);    break;
            case 2 :    System.out.println(a-b);    break;
            case 3 :    System.out.println(a*b);    break;
            case 4 :    System.out.println(a/b);    break;
            case 5 :    System.out.println(a%b);    break;
            default :   System.out.println("plese Enter vailid number\n try again....");
        }

    
    }
}
