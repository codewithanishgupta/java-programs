/*
3.Create a class Calculator that overloads the methods:
->multiply(int, int) 
->multiply(double, double) 
->multiply(int, int, int)     */

class Calculator {
    void multiply(int x, int y) {
        System.out.println("Multiply of two integers: " + (x * y));
    }

    void multiply(double x, double y) {
        System.out.println("Multiply of two double values: " + (x * y));
    }

    void multiply(int x, int y, int z) {
        System.out.println("Multiply of three integers: " + (x * y * z));
    }
}

public class Q3 {
    public static void main(String[] args) {
        Calculator d = new Calculator();

        d.multiply(23, 45);
        d.multiply(23.4, 23.4);
        d.multiply(23, 4, 3);
    }
}
