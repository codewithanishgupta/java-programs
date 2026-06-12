// Q16.Write a Java program to create a simple calculator using switch.

import java.util.Scanner;


public class sixteen {
    public static void main(String [] arg){
        Scanner sc= new Scanner(System.in);
        char ch;
        int num1,num2;
        System.out.print("Enter First number : ");
        num1=sc.nextInt();
        System.out.print("Enter second number : ");
        num2=sc.nextInt();
        System.out.print("Enter your choise (+,-,*,/,%): ");
        ch = sc.next().charAt(0);
        switch(ch){
            case '+' :
                {
                    System.out.println("Number is : "+(num1+num2));
                    break ;
                }
                case '-' :
                {
                    System.out.println("Number is : "+(num1-num2));
                    break ;
                }
                case '*' :
                {
                    System.out.println("Number is : "+(num1*num2));
                    break ;
                }
                case '/' :
                {
                    System.out.println("Number is : "+(num1/num2));
                    break ;
                }
                case '%' :
                {
                    System.out.println("Number is : "+(num1%num2));
                    break ;
                }
                default :
                {
                    System.out.println("Worng choice \n Try again....");
                    break ;
                }
        }
        
    }
}
