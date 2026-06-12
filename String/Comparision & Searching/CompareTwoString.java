// 16. Write a Java program to compare two strings.

import java.util.Scanner;

public class CompareTwoString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1,str2= new String();
        // input string...
        System.out.print("Enter the 1st string : ");
        str1=sc.nextLine();
        System.out.print("Enter the 2st string : ");
        str2=sc.nextLine();
        // compare String...
      
          if(str1.equals(str2)){
            System.out.println("The given Strings are equal..........");
        }else{
            System.out.println("Given Strings are not Equals........");
        }   
        
            // compare ingnoring case....
          if(str1.equalsIgnoreCase(str2)){
            System.out.println("Both Strings are equals (Ignoring case) ...");
        }else{
            System.out.println("Given Strings are not equals (Ingnoring case)...");
        }

          // Lexicographical comparison
        int result = str1.compareTo(str2);
        if (result == 0) {
            System.out.println("Both strings are lexicographically equal.");
        } else if (result < 0) {
            System.out.println("First string comes before the second string.");
        } else {
            System.out.println("First string comes after the second string.");
        }
    }
    
}
