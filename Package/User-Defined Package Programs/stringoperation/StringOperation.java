package stringoperation;

public class StringOperation {

    // Reverse a string
    public String reverse(String str) {
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    // Check if string is palindrome
    public boolean isPalindrome(String str) {
        String rev = reverse(str);
        return str.equalsIgnoreCase(rev);
    }

    // Find length of string
    public int length(String str) {
        return str.length();
    }
}
