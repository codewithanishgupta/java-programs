/* 11.
Write a Java program to reverse the elements of an array using Arrays class.
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class reveseArraysSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();

        // Important: Use Integer[] instead of int[] (Collections methods need objects)
        Integer arr[] = new Integer[n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Convert array to list and reverse
        Arrays.asList(arr); // converts to List view
        Collections.reverse(Arrays.asList(arr));

        System.out.println("Array after reversing:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


