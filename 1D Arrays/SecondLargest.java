/*  10.
Write a Java program to find the second largest element in an array. */

import java.util.Scanner;
import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n;
      System.out.print("Enter how many Element in an array : ");
      n= sc.nextInt();
     int  largest= Integer.MIN_VALUE;
     int secondlargest=Integer.MIN_VALUE;

      int arr[]=new int[n];
        System.out.print("Enter "+n+" Element : ");
      for (int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }

      /*
       using Arrays class...
      
      Arrays.sort(arr);
      System.out.println("Second Largest Number is : "+arr[n-2]);
      */


      // manually solve 
      for(int i=0;i<n;i++ )
      {
        if(arr[i]>largest){
          secondlargest=largest;
          largest=arr[i];
        }else if(arr[i]>secondlargest && arr[i]!=largest){
          secondlargest=arr[i];
        }
      }
      if(secondlargest==Integer.MIN_VALUE){
        System.out.println(" No second largest element all element are same .");
      }else{
        System.out.println("Secondlargest elemnet are : "+secondlargest);
      }
    }
}
