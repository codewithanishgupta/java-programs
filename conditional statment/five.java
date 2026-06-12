// Q5.Write a Java program to check whether a number is divisible by 5 or not.

import java.util.Scanner;
public class five {
    public static void main(String [] arg){
        Scanner sc= new Scanner(System.in);

         int num;
         System.out.println("Enter the given number : ");
         num=sc.nextInt();

         if(num%5==0)
            System.out.println("Given number is Divisible by 5 ");
        else
            System.out.println("Given number is not divisible by 5 ");
        
    }
} 
    

