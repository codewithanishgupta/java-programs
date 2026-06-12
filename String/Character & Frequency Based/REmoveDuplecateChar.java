// 13. Write a Java program to remove duplicate characters.

import java.util.Scanner;

public class REmoveDuplecateChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = new String();
        System.out.println("Enter the given string : ");
        str=sc.nextLine();

        StringBuilder result = new StringBuilder();

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If character not already in result, append it
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }

        System.out.println("String after removing duplicate characters: " + result.toString());
    }
}
