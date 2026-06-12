// 22.Write a Java program to find the sum of each column of a matrix.

import java.util.Scanner;

public class SumEachColumn {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int row,col,sum=0;
        System.out.print("Enter the how many row : ");
        row=sc.nextInt();
        System.out.print("Enter the how many column : ");
        col=sc.nextInt();
        int  arr[][]=new int [row][col];
        System.out.println("Enter "+(row*col)+" Element : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();;
            }
        }
        // sum of each column
        for(int j=0;j<col;j++){
            sum=0;
            for(int i=0;i<row;i++){
                sum=sum+arr[i][j];
            }
            System.out.println("Sum of "+(j+1)+" column : "+sum);
        }
    }
}
