// 24. Write a Java program to remove special characters from string.

import java.util.Scanner;

public class removeSpecialChar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=new String();
        System.out.print("Enter the given string : ");
        str=sc.nextLine();
        char arr[]=str.toCharArray();
        int l=arr.length;
        for(int i=0;i<l;i++){
            if(arr[i]>='a' && arr[i]<='z' || arr[i]>='A' && arr[i]<='Z' || arr[i]>='0' && arr[i]<='9' || arr[i]==' '){
                continue;
            }else{
                for(int j=i;j<l-1;j++)
                arr[j]=arr[j+1];
                l--;
                i--;
            }
        }
        System.out.print("After remove special character string is : ");
        for(int i=0;i<l;i++){
            System.out.print(arr[i]);
        }
    }
}
