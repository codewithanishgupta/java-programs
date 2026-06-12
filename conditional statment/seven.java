 // Q7.Write a Java program to check whether a character is a vowel or consonant.

import java.util.Scanner;
public class seven {
    public static void main(String [] arg){
        Scanner sc= new Scanner(System.in);

        char ch;

        System.out.println("Enter the given character : ");
        ch=sc.next().charAt(0);
        
        ch=Character.toUpperCase(ch);

        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            System.out.println("The Given Character is Vowel...........");
        else
            System.out.println("The Given Character is consonant........");
    }
} 
    

