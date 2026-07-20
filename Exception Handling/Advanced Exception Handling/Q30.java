// 30.Write a Java program to demonstrate the difference between checked and unchecked exceptions.


import java.io.FileNotFoundException;
import java.io.FileReader;

public class Q30 {
    static void checkedExample() throws FileNotFoundException {

        FileReader fr = new FileReader("nonexistent.txt");
        System.out.println("File opened successfully.");
    }

    static void uncheckedExample() {
        int result = 10 / 0;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        System.out.println("--------- Checked vs Unchecked Exceptions ----------");

        try {
            checkedExample();
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception handled: " + e.getMessage());
        }

        try {
            uncheckedExample();
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception handled: " + e.getMessage());
        }

        System.out.println("Program continues after handling both exceptions...");
    }
}