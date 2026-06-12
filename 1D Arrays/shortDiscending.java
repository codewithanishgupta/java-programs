/*  9.
Write a Java program to sort an array in descending order.  */

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class shortDiscending {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,temp;
        System.out.print("Enter the how many element in an array : ");
        n=sc.nextInt();

        System.out.print("Enter "+n+" Element : ");
        // Integer es liye use kiye hai kyu ki Collections class use kiye hai
        Integer arr[]=new Integer [n];      
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        // using arrays class 
       // Arrays.sort(arr,Collections.reverseOrder());


//          using buble short
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("After discending Elements are : ");
        for(int c : arr){
            System.out.println(c);
        }
    }
}
