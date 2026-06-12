// 11. Write a Java program to count frequency of each character.


import java.util.Scanner;


public class frequancyOfEachChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        // Input
        System.out.println("Enter the given String : ");
        str= sc.nextLine();
        // Calculate..
        str=str.toLowerCase();
        int freq[]=new int[256];

        for(int i=0 ; i<str.length() ; i++){
            char ch= str.charAt(i);
            if(ch!=' '){
                freq[ch]++;
            }
        }
        System.out.println("Character frequancy : ");

        for(int i=0; i<freq.length;i++){
            if(freq[i]>0){
                System.out.println((char)i + " : "+freq[i]);
            }
        }


    }
}
