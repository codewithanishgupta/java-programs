// 1. Write a Java program to input a string and print it.

import java.util.Scanner;

public class InputAndPrint {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str;
        System.out.print("Enter the given String : ");
        str=sc.nextLine();
        System.out.println("The given string is : "+str);
    }
}
