// 5. Create a class Shape with method draw(). Derive a class Circle and call both methods.

class Shape {
    void draw() {
        System.out.println("Drawing a shape...");
    }
}

class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing a circle...");
    }
}

public class Q5 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw(); 
        c.drawCircle(); 
    }
}
