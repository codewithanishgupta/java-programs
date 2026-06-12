// 8. Write a Java program to count vowels and consonants in a string.

import java.util.Scanner;
public class countVowelCons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=new String();
        System.out.print("Enter the given String : ");
        str=sc.nextLine();
        int countV=0,countC=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o'|| str.charAt(i)=='u')
            {
                countV++;
            }else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                countC++;
            }else{
                // special character........
            }
        }
        System.out.println("Numbers of vowels in String is : "+countV);
        System.out.println("Number of consonants in String is : "+countC);
    }
}

//  for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);

//             // Check if character is a letter
//             if (ch >= 'a' && ch <= 'z') {
//                 // Check vowels
//                 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                     vowels++;
//                 } else {
//                     consonants++;
//                 }
//             }
//         }
