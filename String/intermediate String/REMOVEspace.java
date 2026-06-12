

// 10. Write a Java program to remove all spaces from a string.


import java.util.Scanner;

public class REMOVEspace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter the given String : ");
        str=  sc.nextLine();
        String  remove= str.replaceAll("\\s+", "");
        System.out.println("After remove space String is : "+remove);
    }
}
