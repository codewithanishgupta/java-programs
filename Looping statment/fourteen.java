// 14. Write a Java program to check whether a number is an Armstrong number.

import java.util.Scanner;

public class fourteen {
      public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int num,rem=0,arm=0,temp;
        System.out.println("Enter the given number : ");
        num=sc.nextInt();
        temp=num;
        for(;num>0;num=num/10){
            rem=num%10;
            arm=arm+(rem*rem*rem);
        }
        if(arm==temp)
            System.out.println("The number is armstrong number...");
        else
            System.out.println("It is not a armstrong number .....");
    }
}
