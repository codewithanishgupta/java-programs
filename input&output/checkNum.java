// Q.8 Write a Java program to input a number and check whether it is positive, negative, or zero.

import java.util.Scanner;
class checkNum{
    public static void main(String [] arg){
        Scanner sc=new Scanner(System.in);
        int num ;
        System.out.print("Enter the given number to check : ");
        num=sc.nextInt();
        if(num>0){
            System.out.println("Numberr is positive.......");
        }else if(num<0){
            System.out.println("Number is negative....");
        }else{
            System.out.println("Number is zero......");
        }
    } 
}
