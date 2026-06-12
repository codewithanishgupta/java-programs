// Write a Java program to find the factorial of a number.

import java.util.Scanner;
public class six {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int num,fact=1;;
        System.out.println("Enter the given integer : ");
        num=sc.nextInt();
        for(int i=1;i<=num;i++){
            fact=fact*i;
            
        }
        System.out.println("Factorial is : "+fact);

    }
}
