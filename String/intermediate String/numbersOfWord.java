// 9. Write a Java program to count number of words in a string.

import java.util.Scanner;


public class numbersOfWord {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = new String();
        System.out.print("Enter the given String : ");
        str= sc.nextLine();
        int countW=0;
        boolean inword=false;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' ' && !inword){
                inword=true;
                countW++;
            }
            else if(ch==' '){
                inword=false;
            }
        }



        // Trim leading/trailing spaces and split by one or more spaces
        // String[] words = str.trim().split("\\s+");

        // // Count words
        //  countW = words.length;
        
        System.out.println("The number of word in given String is : "+countW);
    }
}
