// 24.Write a Java program to check whether a matrix is symmetric.

import java.util.Scanner;

public class SymetricMatrix {
    public static void main(String[] args) {
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
        // check matrix is symatric or not
        if(row != col){
            System.out.println("It is not a symetric matrix because given matrix is not a squre matrix...");
        }else{

            boolean symetric=true;
    
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(arr[i][j]!=arr[j][i]){
                        symetric=false;
                        break;
                    }
                }
            }
            if(symetric)
                System.out.println("Given Matrix is Symetric Matrix............");
            else
                System.out.println("Given Matrix is not a Symetric Matrix............");
        }
    }
}
