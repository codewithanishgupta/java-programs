// 23.Write a program where: Shape s; calls different draw() methods depending on the object.

class Shape {
    void draw() {
        System.out.println("Drawing a generic shape...");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle...");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle...");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Triangle...");
    }
}

public class Q23 {
    public static void main(String[] args) {
        // Runtime polymorphism
        Shape s;

        s = new Circle();
        s.draw();

        s = new Rectangle();
        s.draw();

        s = new Triangle();
        s.draw();
    }
}