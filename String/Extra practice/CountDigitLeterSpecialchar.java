// 27. Write a Java program to count digits, letters, and special characters.

import java.util.Scanner;

public class CountDigitLeterSpecialchar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= new String();
        System.out.print("Enter the Given String : ");
        str=sc.nextLine();
        int dC=0,lC=0,sC=0;
        char arr[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            
            if(Character.isDigit(arr[i])){
                dC++;
            }else if(Character.isLetter(arr[i])){
                lC++;
            }else{
                sC++;
            }
        }
        System.out.println("Number of Digit in String : "+dC);
        System.out.println("Number of Letter in String : "+lC);
        System.out.println("Number of Special Character in String : "+sC);
    }
}
