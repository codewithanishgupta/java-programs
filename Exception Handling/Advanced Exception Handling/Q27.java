// 27.Write a Java program using try-finally without a catch block.

public class Q27 {
    public static void main(String[] args) {
        String name = "Anish";
        System.out.println("Programe started...");

        try {
            char ch = name.charAt(8);
        } finally {
            System.out.println("Finally block executed :");
        }

        System.out.println("programe continue agter try-finally...");
    }
}