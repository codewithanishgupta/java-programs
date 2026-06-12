// 12. Write a Java program to find duplicate characters in a string.

import java.util.Scanner;

public class FindDuplicateCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter the given String : ");
        str=sc.nextLine();

        int dupli[]= new int[256];
        str=str.toLowerCase();
        for(int i=0; i<str.length();i++){
            char ch= str.charAt(i);
            if(ch !=' '){
                dupli[ch]++;
            }
        }
        boolean found=false;
        System.out.println("Duplicate charchter in a string is : ");
        for(int i=0 ;i<dupli.length;i++){
            if(dupli[i]>1){
                System.out.println((char) i + " : "+dupli[i]);
                found = true;
            }
        }
        if(!found){
            System.out.println("No duplicate Character in given String....");
        }
    }
}
