// 22. Write a Java program to capitalize first letter of each word.

import java.util.Scanner;

public class CapitalizeFirstLetterEachWord {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=new String();
        System.out.print("Enter the given String : ");
        str=sc.nextLine();
        char arr[]=str.toCharArray();
        if(arr[0]>='a' && arr[0]<='z'){
            arr[0]=(char)(arr[0]-32);
        }
        for(int i=1;i<arr.length;i++){            
        if(arr[i-1]==' ' && arr[i]>='a' && arr[i]<='z'){
            arr[i]=(char)(arr[i]-32);
        }
        }
        System.out.println("After Captalize each word of Sting");
        for(int i=0;i<str.length();i++){
            System.out.print(arr[i]);
        }
    }
}
