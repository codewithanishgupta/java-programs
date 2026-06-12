// Q25.Write a Java program to input a string and reverse it.

import java.util.Scanner;
public class twenty_five {
    public static void main(String [] arg){
        Scanner sc= new Scanner(System.in);
        String str,rev="";
        int l=0;
        System.out.print("Enter the given String : ");
        str=sc.nextLine();
        System.out.println("Before reverse String is : "+str);
        l=str.length();
        for(int i=l-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println("After reverse String is : "+rev);
        
    }
}