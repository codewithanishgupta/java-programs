//5. Write a Java program to concatenate two strings.

import java.util.Scanner;

public class cancetenateTwoString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1,str2=new String();
        System.out.print("Enter the first String : ");
        str1=sc.nextLine();
        System.out.print("Enter the Second String : ");
        str2=sc.nextLine();
        String result =new String();
        result=str1+str2;
        System.out.println("After Concatenate String are : "+result);
    }
}
