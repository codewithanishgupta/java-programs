// 14.Write a Java program to compare two objects using this keyword.


class Demo {
    int x;
    String id;

    public Demo(int x, String id) {
        this.x = x;
        this.id = id;
    }

    // Method to compare current object with another object
    boolean compare(Demo other) {
        return this.x == other.x && this.id.equals(other.id);
    }
}

public class Q14 {
    public static void main(String[] args) {
        Demo D1 = new Demo(10, "anishprabhakar007");
        Demo D2 = new Demo(10, "anishprabhakar007");
        Demo D3 = new Demo(20, "codewithanish");

        // Compare objects
        System.out.println("D1 vs D2 : " + D1.compare(D2)); // true
        System.out.println("D1 vs D3 : " + D1.compare(D3)); // false
    }
}
