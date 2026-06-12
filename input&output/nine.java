// Q.9 Write a Java program to input a number and find the factorial.

import java.util.Scanner;
public class nine {
    public static void main(String [] arg)
    {
        Scanner sc= new Scanner(System.in);
        int num,fact=1;
        System.out.print("Enter the given integer : ");
        num=sc.nextInt();
        for(int i=1;i<=num;i++){
             fact=fact*i;
        }
        System.out.println("Factorial is : "+fact);
    }
    
}
