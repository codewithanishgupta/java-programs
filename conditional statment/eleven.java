// Q11.Write a Java program to check whether a number is positive, negative, or zero.

import java.util.Scanner;
public class eleven {
    public static void main(String arg[]){
      Scanner sc = new Scanner(System.in);
      int num;
      System.out.println("Enter thge given number : ");
      num= sc.nextInt();
      if(num>0)
         System.out.println("Given number is positive ");
      else if(num<0)
         System.out.println("Given number is negative ");
      else
         System.out.println("The Given number is Zero");
   }
}
