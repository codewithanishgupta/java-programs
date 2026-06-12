// 29. Write a Java program to check if string contains only alphabets.

import java.util.Scanner;

public class CheckStringContainOnlyAlphabet {
    public static void main(String[] args) {
        String str = new String();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the given String : ");
        str= sc.nextLine();
        boolean isAlphabet=true;
        char arr[]= str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(!(Character.isAlphabetic(arr[i])))
                isAlphabet=false;   break;
        }
        if(isAlphabet)
             System.out.println("String contains only aiphabet...........");
        else
            System.out.println("String  not only aiphabet...........");
    
    }
}
