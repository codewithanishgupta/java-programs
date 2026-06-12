// 23.Write a Java program to find the largest element in a matrix.

import java.util.Scanner;

public class largestInMatrix {
     public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int row,col,large=Integer.MIN_VALUE;
        System.out.print("Enter the how many row : ");
        row=sc.nextInt();
        System.out.print("Enter the how many column : ");
        col=sc.nextInt();
        int  arr[][]=new int [row][col];
        System.out.println("Enter "+(row*col)+" Element : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //  largest find
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(large<arr[i][j]){
                    large=arr[i][j];
                }
            }
        }
        System.out.println("Largest element in a matrix is :"+large);
    }
}
