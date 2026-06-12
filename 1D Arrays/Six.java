// 6.Write a Java program to count even and odd numbers in an array.

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
           int n,countEven=0,countOdd=0;
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter how may element in an array : ");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" Element : ");
            arr[i]=sc.nextInt();
        }
        for(int c : arr){
            if(c%2==0)
                countEven++;
            else
                countOdd++;
        }
        System.out.println("NUMBER OF EVEN ELEMENT IS : "+countEven);
        System.out.println("NUMBER OF ODD ELEMENT IS : "+countOdd);
    }
}
