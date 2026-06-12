// 26. Write a Java program to toggle case (upper ↔ lower).

import java.util.Scanner;

public class toggleCase {
    public static void main(String[] args) {
        String s= new String();
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the given String : ");
        s=sc.nextLine();
        char arr[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
                if(Character.isUpperCase(arr[i]))
                    {
                    arr[i]=Character.toLowerCase(arr[i]);
                }else if(Character.isLowerCase(arr[i]))
                    {
                    arr[i]=Character.toUpperCase(arr[i]);
                }
            }
            
            System.out.println("After change togle case Strings is : "+new String (arr));
    }
}
