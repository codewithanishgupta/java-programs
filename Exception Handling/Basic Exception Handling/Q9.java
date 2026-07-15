// 9.Write a Java program to handle StringIndexOutOfBoundsException.

public class Q9 {
    public static void main(String[] args) {

        String name = "Anish";

        try {
            char ch = name.charAt(8);
            System.out.println("Character at index 8 is : " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception handled : " + e + " Invalid String index accessed.");
        }

        System.out.println("Program continues after Exception hamdling...");
    }
}
