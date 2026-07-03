// 20.Create a program demonstrating interface-based runtime polymorphism. 


interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle...");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle...");
    }
}

class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle...");
    }
}

public class Q20 {
    public static void main(String[] args) {
        // Interface reference pointing to different objects at runtime
        Shape s;

        s = new Circle();     // runtime polymorphism
        s.draw();

        s = new Rectangle();  // runtime polymorphism
        s.draw();

        s = new Triangle();   // runtime polymorphism
        s.draw();
    }
}

