// 4. Write a Java program to convert a string to lowercase.

import java.util.Scanner;

public class LowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= new String();
        System.out.print("Enter the given String : ");
        str= sc.nextLine();
        str=str.toLowerCase();
        System.out.println("After convert into LowerCase String is : "+str);
    }
}
