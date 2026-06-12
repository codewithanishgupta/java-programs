/*  12.
Write a Java program to copy one array into another array. */

import java.util.Scanner;
public class copyOneToAnotherArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]={12,34,56,78};
        int carr[]= new int[arr.length];

        for(int i=0;i<4;i++){
            carr[i]=arr[i];
        }
        System.out.println("After copy arrays are : ");

        for(int i=0;i<4;i++){
            System.out.println(carr[i]);
        }

    }
}
