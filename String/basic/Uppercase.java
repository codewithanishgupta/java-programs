// 3. Write a Java program to convert a string to uppercase.

import java.util.Scanner;

public class Uppercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= new String();
        System.out.print("Enter the given Strings : ");
        str=sc.nextLine();
        str=str.toUpperCase();
        System.out.println("After Convert UpperCase of The given String : "+str);       

    }
}
