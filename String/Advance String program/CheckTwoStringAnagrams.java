// 21. Write a Java program to check whether two strings are anagrams.

import java.util.Arrays;
import java.util.Scanner;

public class CheckTwoStringAnagrams {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1,str2=new String();
        System.out.print("Enter the given 1st string : ");
        str1= sc.nextLine();
        System.out.print("Enter the 2nd string : ");
        str2=sc.nextLine();
        // convert into Lowercase
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        //convert to character in array..
        char s1[]=str1.toCharArray();
        char [] s2=str2.toCharArray();

        // SHort both aray
        Arrays.sort(s1);
        Arrays.sort(s2);
        //compare
        if(Arrays.equals(s1,s2)){
            System.out.println("Given Strings are Anagrams......");
        }else{
            System.out.println("Given Strings are not Anagrams......");
        }
    }
    
}
