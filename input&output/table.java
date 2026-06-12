// Q7.Write a Java program to input a number and print its multiplication table.

import java.util.Scanner;
public class table {
    public static void main(String [] arg){
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the given number : ");
        num=sc.nextInt();
        System.out.println("Table of given nuumber .....");
        for(int i=1;i<=10;i++){
            int tab=num*i;
            System.out.println(tab);
        }
    }
    
}
