// Write a Java program to print the multiplication table of a number.

import java.util.Scanner;

public class seven {
     public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int num,tab=1;
        System.out.println("Enter the given number to find multiplication : ");
        num=sc.nextInt();
        System.err.println("Table is : ");
        for(int i=1;i<=10;i++){
            tab=i*num;
            System.err.println(num+"*"+i+"="+tab);
        }
    }
}
    
