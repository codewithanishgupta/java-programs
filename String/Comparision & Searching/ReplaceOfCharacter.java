// 19. Write a Java program to replace a character in string.

import java.util.Scanner;

public class ReplaceOfCharacter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= new String();
        // input;
        System.out.print("Enter the given string : "+str);
        str=sc.nextLine();
        System.out.print("Enter the Character who replace : ");
        char ch=sc.next().charAt(0);
        System.out.print("Enter the new character : ");
        char newChar=sc.next().charAt(0);
        
          // Convert string to char array
        char arr[]=str.toCharArray();
        
        for(int i=0;i<str.length();i++){
            if(arr[i]==ch){
                arr[i]=newChar;
            }
        }
        String replace=new String(arr);
        System.out.println("String after replacement: " + replace);

        /*   
        // Replace character
        String replacedStr = str.replace(oldChar, newChar);

        // Output result
        System.out.println("String after replacement: " + replacedStr);

         */
    }
}
