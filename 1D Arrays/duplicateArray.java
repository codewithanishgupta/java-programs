// 14.Write a Java program to count duplicate elements in an array.

import java.util.Scanner;

public class duplicateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,c=0;
        System.out.print("Enter how many elements in an array : ");
        n= sc.nextInt();
        int arr[]= new int[n];
        System.out.print("Enter "+n+" Element : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    c++;
                    break;
                }
            }
        }
        System.out.println("Total number of duplicate element : "+c);
    }    
}
