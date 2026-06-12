// 14. Write a Java program to find first non-repeating character.



import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // input string
        String str= new String();
        System.out.print(" Enter the given String : ");
        str=sc.nextLine();
        int rep[]=new int[256];
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch != ' '){
                rep[ch]++;
            }
        }
        char result='\0';
        System.out.print("First non Repeating Character is : ");
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' ' && rep[ch]==1){
                result=ch;
                break;
            }
        }
       if(result!='\0'){
        System.out.println("First non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
