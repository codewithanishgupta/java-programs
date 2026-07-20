// 29.Write a Java program that catches the parent class Exception instead of specific exceptions.

public class Q29 {
    public static void main(String[] args) {
        System.out.println("--------- Parent Exception Catch Demo ----------");

        try {
            int result = 10 / 0;

            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);

            String str = null;
            System.out.println(str.length());

        } catch (Exception e) {  
            System.out.println("Exception handled: " + e.getClass().getName() + " | " + e.getMessage());
        }

        System.out.println("Program continues after handling exception...");
    }
}
