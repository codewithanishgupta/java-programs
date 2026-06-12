// 3.
// Write a Java program to find the average of array elements.

import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        double sum=0,avg=0;
        System.out.print("Enter the how many element in array : ");
        n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" Element : ");
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        avg=sum/n;
        System.out.println("Average of Element is : "+avg);
        System.out.println(arr.length);
    }
}
