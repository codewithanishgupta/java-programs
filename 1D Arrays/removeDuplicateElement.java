// 15.Write a Java program to remove duplicate elements from an array.

import java.util.Scanner;
public class removeDuplicateElement {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
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
                    for(int k=j;k<n-1;k++){
                        arr[k]=arr[k+1];
                    }
                    n--;
                    j--;
                }
            }
        }
        
        System.out.println("After remove element arrays isn  : ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        
    }    
}

