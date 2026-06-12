// Q19.Write a Java program to input a character and check whether it is a vowel or consonant


import java.util.Scanner;
public class ninteen {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        char ch;
        System.out.print("Enter the given Character : ");
        ch=sc.next().charAt(0);
        ch=Character.toLowerCase(ch);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("Character is Vowel......");
        }else{
            System.out.println("Character is Consonant......");
        }
    }
    
}
