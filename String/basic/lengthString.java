
import java.util.Scanner;

//2. Write a Java program to find the length of a string.

public class lengthString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= new String();
        int l=0;
        System.out.print("Enter the given string : ");
        str=sc.nextLine();
        l=str.length();
        System.out.println("Length of given string is : "+l);

    }    
}
