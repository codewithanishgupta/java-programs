// 19.Write a Java program to multiply two matrices.


import java.util.Scanner;
public class multiTwoMatrix {
    public static void main(String[] args) {
        int m,n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter how many row in matrix : ");
        m= sc.nextInt();
        System.out.print("Enter how many column in an Arays : ");
        n= sc.nextInt();
        int arr1[][]= new int[m][n];
        int arr2[][]= new int[m][n];
        int c[][]= new int[m][n];
        System.out.println("Enter first matrix "+m*n+" Element ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Scond matrix "+m*n+" Element ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                c[i][j]=0;
                for(int k=0;k<n;k++)
               c[i][j]+= arr1[i][k]*arr2[k][j];
            }
        }
        System.out.println("After Multiply matrix are :  ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(c[i][j]+"  ");
            }
            System.out.println();
        }
    }
    
}
