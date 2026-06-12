// 23. Write a Java program to find longest word in a sentence.


import java.util.Scanner;
public class findLowestWordInString {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String str= new String();
        System.out.println("Enter thge given String : ");
        str=sc.nextLine();
        String words[]= str.split("\\s+");
        
        String longest="";
        int maxlength=0;
        for(String word : words){
            if(word.length()>maxlength){
                maxlength=word.length();
                longest=word;
            }
        }
        System.out.println("Longest word in a sentance is : "+longest);
        System.out.println("length of word is : "+maxlength);
    }
}
