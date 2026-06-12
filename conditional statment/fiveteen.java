// Q15.Write a Java program to check whether a number is divisible by both 5 and 11.

import java.util.Scanner;

public class fiveteen {
     public static void main(String [] arg){
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Enter the Given number : ");
        num=sc.nextInt();
        if(num%5==0 && num%11==0)
            System.out.println("Number is divisible by both 5 and 11.");
        else 
            System.out.println("Number is not divisible by both 5 and 11.");
     }
}
