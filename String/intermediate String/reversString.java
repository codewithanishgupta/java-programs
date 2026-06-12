// 6. Write a Java program to reverse a string.

import java.util.Scanner;

class reversString{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= new String();
        System.out.print("Enter the given String : ");
        str=sc.nextLine();
        // String rev= new StringBuilder(str).reverse().toString();
        // System.out.println("After revese String is : "+rev);
        int l=str.length();
            for(int i=l-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}