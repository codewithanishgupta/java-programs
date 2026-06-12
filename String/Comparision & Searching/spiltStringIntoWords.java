// 20. Write a Java program to split a string into words.


import java.util.Scanner;
public class spiltStringIntoWords {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
   
           // Input string
           System.out.print("Enter a string: ");
           String str = sc.nextLine();
   
           // Split by one or more spaces
           String[] words = str.trim().split("\\s+");
   
           // Print words
           System.out.println("Words in the string:");
           for (String word : words) {
               System.out.println(word);
           }
    }
}
/*  Use split("\\s+") → handles multiple spaces.

Use trim() → removes leading/trailing spaces.

Loop through the array to print each word. */