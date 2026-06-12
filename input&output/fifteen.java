// Q15.Write a Java program to input a number and check whether it is an Armstrong number.

import java.util.Scanner;
public class fifteen {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int num,rem=0,arm=0;
        System.out.print("Enter the given number : ");
        num=sc.nextInt();
        int temp=num;
        while(num>0){
            rem=num%10;
            arm=arm+(rem*rem*rem);
            num=num/10;
        }
        if(temp==arm){
            System.out.println("Given number is armstrong number...");
        }else{
            System.out.println("Given number is not armstrong number...");
        }
    }
}
