// 7. Write a Java program to check whether a string is palindrome.

import java.util.Scanner;

public class palindromeCHeck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= new String();
        System.out.print("Enter the given String : ");
        str=sc. nextLine();
        String check = new StringBuilder(str).reverse().toString();
        if(str.equals(check))
            System.out.println("The given String is palindrome........");
        else
            System.out.println("The given string is not a palindrome.......");
    }
}
