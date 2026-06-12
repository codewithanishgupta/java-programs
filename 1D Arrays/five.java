// 5.Write a Java program to find the smallest element in an array.

import java.util.Scanner;

public class five {
     public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter how may element in an array : ");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" Element : ");
            arr[i]=sc.nextInt();
        }
        int small=arr[0];
        for(int c : arr){
            if(small>c)
                small=c;
        }
        System.out.println("Largest number of an Elements is : "+small);
    }
}
