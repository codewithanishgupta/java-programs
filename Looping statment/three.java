// Q3.Write a Java program to print even numbers from 1 to 50.

import java.util.Scanner;
public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i=1;
        System.out.println("Even numbers froms 1 to 50");
        while(i<=50)
        {
            if(i%2==0)
                System.out.print(i+" ");
            i++;
        }
    }
    
}
