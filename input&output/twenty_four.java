// Q24.Write a Java program to input a string and convert it to uppercase.

import java.util.Scanner;
public class twenty_four {
    public static void main(String [] arg){
        Scanner sc= new Scanner(System.in);
        String str;
        System.out.print("Enter the  given string : ");
        str=sc.nextLine();
        System.out.println("String is : "+str);
        str=str.toUpperCase();
        System.out.println("After UpperCase String is : "+str);
    }
}