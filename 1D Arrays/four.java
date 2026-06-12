// 4.
// Write a Java program to find the largest element in an array.
import java.util.Scanner;
public class four {
    public static void main(String[] args) {
        int n,larg=0;
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter how may element in an array : ");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" Element : ");
            arr[i]=sc.nextInt();
        }
        for(int c : arr){
            if(larg<c)
                larg=c;
        }
        System.out.println("Largest number of an Elements is : "+larg);
    }
}
