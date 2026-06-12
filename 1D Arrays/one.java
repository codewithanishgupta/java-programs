/*  1.
Write a Java program to input 10 numbers in an array and print them. */

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        int arr[]= new int [10];
        Scanner sc= new Scanner(System.in) ;
        System.out.println("Enter the given 10 numbers ...");
        for(int i=0;i<10;i++){
            System.out.print("Enter "+(i+1)+" Number : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("The given 10 numbers is  ");
        // for(int i=0;i<10;i++){
        //     System.out.println((i+1)+".first Number is : "+arr[i]);
        // }
        int i=1;
        for(int c : arr){       // for-each Loop
             System.out.println((i++)+". Number is : "+c);
        }
    }
}
