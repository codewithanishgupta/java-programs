// 19.Create a class Shape with method draw(). Override it in Circle and Rectangle.

class Shape {
    void draw() {
        System.out.println("Drawing a shape ");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawig a Circle shape...");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle shape.....");
    }
}

public class Q19 {
    public static void main(String[] args) {
        Shape d;
        d = new Circle();
        d.draw();

        d = new Rectangle();
        d.draw();
    }
}
