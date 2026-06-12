/// Q.11 Write a Java program to input a number and reverse the number.

import java.util.Scanner;
public class eleven {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num,rev=0;
         System.out.print("Enter any number : ");
         num=sc.nextInt();
         System.out.print("After Reverse Number is : ");
         while(num>0){
            rev=num%10;
            num=num/10;
            System.out.print(rev);
         }

    }
    
}
