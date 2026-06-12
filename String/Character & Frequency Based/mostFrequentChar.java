// 15. Write a Java program to find most frequent character.

import java.util.Scanner;

public class mostFrequentChar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = new String();
        // input...
        System.out.print(" Enter the Given String : ");
        str=sc.nextLine();
        // convert lowercase
        str=str.toLowerCase();

        int freq[]= new int[256];
        int mostfreq=Integer.MIN_VALUE;
        char result='\0';
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                freq[ch]++;
            }
        }

        for(int i=0 ; i<freq.length;i++){
            if(freq[i]>mostfreq){
                mostfreq=freq[i];
                 result=(char)i;
             }
        }
       if (result != '\0') {
            System.out.println("Most frequent character: " + result);
            System.out.println("Frequency: " + mostfreq);
        } else {
            System.out.println("No characters found.");
        }
    }
}
