/*\
2.Write a Java program to overload a method area() to calculate the area of:
->Circle 
->Rectangle 
->Square  */

class Area {
    double area(double radius) {
        return (Math.PI * radius * radius);
    }

    double area(int length, int breadth) {
        return (length * breadth);
    }

    double area(int side) {
        return (side * side);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Area a = new Area();

        System.out.println("Area of Circle : " + a.area(3.4));
        System.out.println("Area of Rectangle : " + a.area(3, 6));
        System.out.println("Area of Square : " + a.area(4));
    }
}
