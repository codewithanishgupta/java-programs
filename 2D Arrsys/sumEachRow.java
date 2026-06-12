// 21. Write a Java program to find the sum of each row of a matrix.

import java.util.Scanner;
public class sumEachRow {
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
        // sum of each row 
        for(int i=0;i<row;i++){
            sum=0;
            for(int j=0;j<col;j++){
                sum=sum+arr[i][j];
            }
            System.out.println("Sum of "+(i+1)+" row : "+sum);
        }
    }
}
