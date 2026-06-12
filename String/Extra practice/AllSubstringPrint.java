// 30. Write a Java program to print all substrings of a string.

import java.util.Scanner;

public class AllSubstringPrint {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= new String();
        System.out.print("Enter the given String : ");
        str= sc.nextLine();
        int n= str.length();
        System.out.println("All subs string are : ");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                System.out.println(str.substring(i, j));
            }
        }
    }
}
