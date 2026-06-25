// 39.Write a Java program to show why abstract classes cannot be instantiated.

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing Circle...");
    }
}

public class Q39 {
    public static void main(String[] args) {
        // cannot be instantiated.   abstract class
        // Shape s = new shape ()  // compilation Error

        Shape s = new Circle();
        s.draw();
    }
}
