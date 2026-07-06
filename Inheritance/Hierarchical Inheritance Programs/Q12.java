// 12. Create a base class Shape and derive:Rectangle,Circle ,Triangle Calculate area for each shape.

class Shape {
    void area() {
        System.out.println("Calculating area of a shape...");
    }
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        int rectArea = length * breadth;
        System.out.println("Area of Rectangle: " + rectArea);
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        double circleArea = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + circleArea);
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    void area() {
        double triArea = 0.5 * base * height;
        System.out.println("Area of Triangle: " + triArea);
    }
}

public class Q12 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        Circle cir = new Circle(7);
        Triangle tri = new Triangle(6, 4);

        rect.area();
        cir.area();
        tri.area();
    }
}
