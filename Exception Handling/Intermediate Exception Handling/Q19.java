// 19.Write a Java program to perform file reading and handle IOException.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q19 {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("sample.txt")); // ensure sample.txt exists
            String line;

            System.out.println("Reading file content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            // Handle IOException (file not found, read error, etc.)
            System.out.println("Exception handled: " + e.getMessage());
        } finally {
            // Always close resources in finally block
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("File closed successfully.");
                }
            } catch (IOException e) {
                System.out.println("Error while closing file: " + e.getMessage());
            }
        }

        System.out.println("Program continues after handling exception...");
    }
}
