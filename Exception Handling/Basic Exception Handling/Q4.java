// 4.Write a Java program to handle NumberFormatException.

public class Q4 {
    public static void main(String[] args) {
        String str = "Anish";

        try{
            int n = Integer.parseInt(str);
            System.out.println("String convert number : "+ n);
        }catch (NumberFormatException e ){
            System.out.println("Exception Handled: "+e+" Input string is not a valid integer.");
        }

        System.out.println("Program continues after handling exception...");
    }
}