// Write a Java program to check whether a number is prime or not.

import java.util.Scanner;

public class eleven {
     public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int num,c=0;
        System.out.println("Entger the given number : ");
        num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                c++;
            }

        }
        if(c==2){
            System.out.println("The given number is prime number.....");
        }else{
            System.out.println("The given number is not a prime number....");
        }
    }
}
