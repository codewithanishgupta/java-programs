// 17.Write a Java program to calculate the power of a number using loops.

import java.util.Scanner;

public class seventeen {
      public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int num,pow,result=1;
        System.out.println("Enter the given number : ");
        num=sc.nextInt();
        System.out.println("Enter the exponant ");
        pow=sc.nextInt();
        for(int i=1;i<=pow;i++){
            result*=num;
        }
        System.out.println("After calculate the power of a number. number is : "+result);
    }
}
