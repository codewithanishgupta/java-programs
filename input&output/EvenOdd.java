//  q. Write a Java program to input a number and check whether it is even or odd.

import java.util.Scanner;

public class EvenOdd {
    public static void main(String arg[]){
        int num;
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the given Number : ");
        num = s.nextInt();
        
        if(num%2==0){
            System.out.println("Numer is Even...");
        }else{
            System.out.println("Number is odd..");
        }
    }
}
