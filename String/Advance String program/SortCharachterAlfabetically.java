// 25. Write a Java program to sort characters of a string alphabetically.

import java.util.Arrays;
import java.util.Scanner;
public class SortCharachterAlfabetically {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=new String();
        System.out.print("Enter the given String :");
        str=sc.nextLine();
        char arr[]=str.toCharArray();
        Arrays.sort(arr);
        System.out.print("After sort character String is :");
        for(char c : arr){
            System.out.print(c);
        }

    }
}
