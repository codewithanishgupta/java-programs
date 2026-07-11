/*1.Write a Java program to overload a method add() for:
Two integers ,Three integers ,Two double values  */

class Example {
    void add(int x, int y) {
        System.out.println("Sum of two integers: " + (x + y));
    }

    void add(int x, int y, int z) {
        System.out.println("Sum of three integers: " + (x + y + z));
    }

    void add(double x, double y) {
        System.out.println("Sum of two double values: " + (x + y));
    }
}

public class Q1 {

    public static void main(String[] args) {
        Example e = new Example();

        e.add(5, 6);
        e.add(12, 34, 45);
        e.add(12.5, 43.5);
    }
}