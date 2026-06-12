// 25.Write a Java program to print diagonal elements of a matrix.

import java.util.Scanner;

public class printDigonal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row,col;
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
       /* if (row != col) {
            System.out.println("\nDiagonal elements cannot be printed (matrix is not square).");
        } else {
            System.out.println("Digonals of given matrix is : ");
            for(int i=0;i<row;i++){
                for(int j=0; j<col;j++){
                    if(i==j){
                        System.out.print(arr[i][j]+"  ");
                    }
                }
            }
        }
            */
       // /*
        // Check if square matrix
        if (row != col) {
            System.out.println("\nDiagonal elements cannot be printed (matrix is not square).");
        } else {
            // Print main diagonal
            System.out.println("\nMain diagonal elements:");
            for (int i = 0; i < row; i++) {
                System.out.print(arr[i][i] + " ");
            }

            // Print secondary diagonal
            System.out.println("\nSecondary diagonal elements:");
            for (int i = 0; i < row; i++) {
                System.out.print(arr[i][row - 1 - i] + " ");
            }
        }
             //*/
    }
}
