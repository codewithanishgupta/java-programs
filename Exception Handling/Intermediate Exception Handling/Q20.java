// 20.Write a Java program to handle FileNotFoundException.


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        try {
            File file = new File("sample.txt"); // ensure sample.txt exists or test with a missing file
            Scanner sc = new Scanner(file);

            System.out.println("Reading file content:");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();

        } catch (FileNotFoundException e) {
            // Handle FileNotFoundException
            System.out.println("Exception handled: File not found. Please check the file path.");
        }

        System.out.println("Program continues after handling exception...");
    }
}
