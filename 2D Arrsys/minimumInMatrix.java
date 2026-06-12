// 23.Write a Java program to find the minimum element in a matrix.

import java.util.Scanner;

public class minimumInMatrix {

     public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int row,col,min=Integer.MAX_VALUE;
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
                if(min>arr[i][j]){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("Largest element in a matrix is :"+min);
    }
}
