// 3.Write a Java program to handle NullPointerException.

public class Q3 {
    public static void main(String[] args) {
        String str = null;

        try {        
            System.out.println("Length of String is : "+str.length());
        } catch (NullPointerException e) {
            System.out.println("Exception Handled : "+e+" String referance is null.");
        }

        System.out.println("Program continues after Handling Exceptions...");
    }
}