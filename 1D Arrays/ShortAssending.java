// 8.
// Write a Java program to sort an array in ascending order.

import java.util.Scanner;
import java.util.Arrays;

public class ShortAssending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,temp;
        System.out.print("Enter how many element inan array : ");
        n= sc.nextInt();

        int arr[]=new int[n];
        System.out.print("Emter n elenment : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        // using arrays class
       //Arrays.sort(arr);
        
        // Using bubble short..
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(" Elements of array in ascending order");
        for(int i=0;i<n+1;i++){
            System.out.println(arr[i]);
       }
    }
    
}
