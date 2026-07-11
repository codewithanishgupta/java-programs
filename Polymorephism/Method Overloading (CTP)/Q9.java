/*
9.Write a Java program to overload a method findMax() for:
-> Two integers 
-> Three integers 
-> Two double values   */

class Max {
    void findMax(int x, int y) {
        int max = (x > y ? x : y);
        System.out.println("Maximum of two integers: " + max);
    }

    void findMax(int x, int y, int z) {
        int max = (x > y ? (x > z ? x : z) : (y > z ? y : z));
        System.out.println("Maximum of three integers: " + max);
    }

    void findMax(double x, double y) {
        double max = x > y ? x : y;
        System.out.println("Maximum of two double values: " + max);
    }
}

public class Q9 {
    public static void main(String[] args) {
        Max m = new Max();

        m.findMax(2, 4);

        m.findMax(3, 34, 4);
        m.findMax(12, 4, 45);
        m.findMax(56, 34, 50);

        m.findMax(23.5, 34.6);
    }
}
