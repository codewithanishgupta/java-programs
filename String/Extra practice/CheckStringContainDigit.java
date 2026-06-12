// 28. Write a Java program to check if string contains only digits.

import java.util.Scanner;

public class CheckStringContainDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        System.out.print("Enter the given String : ");
        str=sc.nextLine();
        boolean isDigit=true;
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(Character.isDigit(arr[i])){
                isDigit=true;
            }else{
                isDigit=false;
                break;
            }
        }
        if(isDigit){
            System.out.println("string contains only digits.....");
        }else{
            
            System.out.println("string not only digits.....");
        }
    }
    
}
