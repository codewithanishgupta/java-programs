// 20.Write a Java program to find the transpose of a matrix.

import java.util.Scanner;
public class transposeOfMatrix {
    public static void main(String[] args) {
        int m,n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter how many row in matrix : ");
        m= sc.nextInt();
        System.out.print("Enter how many column in an Arays : ");
        n= sc.nextInt();
        int arr[][]= new int[m][n];
        int c[][]= new int[n][m];
        System.out.println("Enter "+m*n+" Element ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                c[j][i]=arr[i][j];
            }
        }
        System.out.println("After transpose Matrix is : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(c[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
