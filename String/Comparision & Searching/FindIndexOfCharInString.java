// 18. Write a Java program to find index of a character in string.

import java.util.Scanner;


public class FindIndexOfCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=new String();
        // input data..
        System.out.print("Enter the given String : ");
        str=sc.nextLine();
         System.out.print("Enter the character to find: ");
        char ch = sc.next().charAt(0);
        // find index..
        System.out.println("Character ");
        for(int i=0;i<str.length();i++){
           char check=str.charAt(i);
            if(check==ch){
                System.out.println(check+" Is an index : "+i);
                break;
            }
        }

        // Find index using indexOf()
        // int index = str.indexOf(ch);
        // if (index != -1) {
        // System.out.println("Character '" + ch + "' found at index: " + index);
        // }else{
        // System.out.println("Character '" + ch + "' not found in the string.");
        // }

    }
}
