// 17. Write a Java program to check substring presence.

import java.util.Scanner;

public class CheckSubstringPresence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1,str2=new String();
        // input data...
        System.out.print("Enter the first String :");
        str1=sc.nextLine();
        System.out.print("eNTER 2ND  String : ");
        str2=sc.nextLine();
        // check substring...
        if(str1.contains(str2)){
            System.out.println("Substring "+str2+" Presence in main String...");
        }else{
            System.out.println("Substring "+str2+" not Presence in main String...");
        }
        /*    // Check presence using contains()
        if (mainStr.contains(subStr)) {
            System.out.println("Substring \"" + subStr + "\" is present in the main string.");
        } else {
            System.out.println("Substring \"" + subStr + "\" is NOT present in the main string.");
        } */
    }
}
