// 16.Write a Java program to find the largest digit in a number.

import java.util.Scanner;

public class sixteen {
      public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int num,largest=0,rem=0;
        System.out.println("Enter the given number : ");
        num=sc.nextInt();
        for(int temp=num;num>0;num/=10){
            rem=num%10;
            if(rem>largest){
                largest=rem;
            }
        }
        System.out.println("Largest digit of given number is : "+largest);
    }
}

