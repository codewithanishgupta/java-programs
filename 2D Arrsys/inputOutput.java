//  16.Write a Java program to input and print a 2D array (matrix).
import java.util.Scanner;
public class inputOutput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r,c;
        System.out.print("Enter the how many row in an array : ");
        r= sc.nextInt();
        System.out.print("Enter the hpw many column in an array : ");
        c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.print("Enter "+r*c+" Element :  ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Elements of arrays are : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+"    ");
            }
            System.out.println();
        }
    }
}
