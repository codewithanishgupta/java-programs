// Q21.Write a Java program to input 10 numbers and find the largest number.

import java.util.Scanner;
public class twenty_one {
    public static void main(String arg[]){
        int num,max=Integer.MIN_VALUE;
        System.out.println(max);
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter given 10 number : ");
        for(int i=0;i<10;i++){
            num=sc.nextInt();
            if(num>max){
                max=num;
            }
        }
        System.out.println("Largest number is : "+max);
    }
    
}
