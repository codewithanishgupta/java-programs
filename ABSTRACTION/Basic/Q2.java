// 2.Write a Java program to create an abstract class Shape with an abstract method area() and  implement it in Rectangle.

abstract class Shape{
    abstract double area();
}

class Rectangle extends Shape{
    double length;
    double breadth;

    public Rectangle(double l , double b) {
        this.length=l;
        this.breadth=b;
    }
    @Override
    double area(){
        return (length * breadth);
    }

}

public class Q2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(12, 54);
        System.out.println("Area of rectangle is : "+r.area());
    }
}
