//  Write a Java program to print the Fibonacci series up to n terms.

import java.util.Scanner;

public class twelve {
     public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n,x=0,y=1,z=0;
        System.out.println("Enter terms to find febonacci series : ");
        n=sc.nextInt();
        System.out.print("series is : ");
        for(int i=0;i<=n;i++){
            System.out.print(z+" ");
            z=x+y;
            x=y;
            y=z;
        }
    }
}
