// 11.
// Write a Java program to reverse the elements of an array.

import java.util.Scanner;

public class ReversElementinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the how many element in an array :");
        n= sc.nextInt();
        int arr[]= new int[n];
        System.out.print("Enter the"+n+"Element : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("After revers Arrays Elements are : ");

        /*
        logic number 1
        for(int i=n-1;i>=0;i--){
            System.out.println(arr[i]);
        }
            */

        // // Reverse logic
        for(int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
