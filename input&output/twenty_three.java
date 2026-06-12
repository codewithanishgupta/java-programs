// Q23.Write a Java program to input a string and print its length.

import java.util.Scanner;
public class twenty_three {
    public static void main(String [] arg){
        Scanner sc= new Scanner(System.in);
        String str;
        long length;
        System.out.print("Enter the given String : ");
        str=sc.nextLine();
        length=str.length();
        System.out.println("Length of string is : "+length );

    }
}