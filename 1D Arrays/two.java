/*  2.
Write a Java program to find the sum of all elements in an array. */

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,sum=0;
        System.out.print("Enter how Many element in Array : ");
        n=sc.nextInt();
        int arr []= new int [n];
        System.out.println("Enter "+n+" Element.... ");
        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" Element : ");
            arr[i]=sc.nextInt();
        }

        for(int c : arr){
            sum=sum+c;       
        }
        System.out.print("Sum of all Elements is : "+sum);
    }
}
