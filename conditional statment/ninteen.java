// Q19.Write a Java program to check whether a character is vowel using switch.

import java.util.Scanner;

public class ninteen {
    public static void main(String [] arg){
        Scanner sc= new Scanner(System.in);
        char ch;
        System.out.print("Enter the Given Character ");
        ch = sc.next().charAt(0);
        ch=Character.toUpperCase(ch);
        switch(ch){
            case 'A' :
                {
                    System.out.println("Given Character is Vowel ");
                    break ;
                }
                case 'E' :
                {
                    System.out.println("Given Character is Vowel ");
                    break ;
                }
                case 'I' :
                {
                    System.out.println("Given Character is Vowel ");
                    break ;
                }
                case 'O' :
                {
                    System.out.println("Given Character is Vowel ");
                    break ;
                }
                case 'U' :
                {
                    System.out.println("Given Character is Vowel ");
                    break ;
                }
                default :
                {
                    System.out.println("Given Character is constant");
                    break ;
                }
        }
        
    }
    
}
