// 15.Write a Java program to print all numbers divisible by 5 between 1 and 100.

import java.util.Scanner;

public class fifteen {
     public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Lll numbers divisible by 5 between 1 and 100 : ");
        for(int i=1 ; i<=100; i++){
            if(i%5==0)
                System.out.println(i);
        }
}
}
