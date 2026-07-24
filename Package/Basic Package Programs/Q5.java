// 5. Create a package geometry with classes Circle and Rectangle to calculate area.


import geometry.*;
public class Q5 {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        Rectangle r = new Rectangle(4.0, 6.0);

        System.out.println("Area of Circle: " + c.area());
        System.out.println("Area of Rectangle: " + r.area());
    }
}
