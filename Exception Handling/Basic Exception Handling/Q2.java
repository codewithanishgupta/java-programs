// 2.Write a Java program to handle ArrayIndexOutOfBoundsException.

public class Q2 {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6}  ;

        System.out.print("Elements are : ");
        try {  
            for(int i=0 ; i<8 ; i++){
                System.out.print(arr[i]+" ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\n Excepttion Handled " +e+ " | Array has fewer than 8 elements.");
        }

        System.out.println("\n Array elementd printed successfully...");
    }
}