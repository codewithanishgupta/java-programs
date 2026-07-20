// 28.Write a Java program using try-with-resources for file handling.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q28 {
    public static void main(String[] args) {
        System.out.println("--------- Try-with-Resources File Handling ----------");

        // try-with-resources ensures BufferedReader is closed automatically
        try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Read: " + line);
            }
        } catch (IOException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }

        System.out.println("Program continues after file handling...");
    }
}