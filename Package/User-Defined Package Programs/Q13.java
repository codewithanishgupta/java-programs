// 13.Create a package stringoperation containing methods:Reverse String,Palindrome Check,String Length 

import stringoperation.StringOperation;

public class Q13 {
    public static void main(String[] args) {
        StringOperation so = new StringOperation();

        String s1 = "Anish";
        String s2 = "madam";

        System.out.println("Original String: " + s1);
        System.out.println("Reversed String: " + so.reverse(s1));
        System.out.println("Length of String: " + so.length(s1));
        System.out.println("Is '" + s1 + "' Palindrome? " + so.isPalindrome(s1));

        System.out.println("\nOriginal String: " + s2);
        System.out.println("Reversed String: " + so.reverse(s2));
        System.out.println("Length of String: " + so.length(s2));
        System.out.println("Is '" + s2 + "' Palindrome? " + so.isPalindrome(s2));
    }
}

