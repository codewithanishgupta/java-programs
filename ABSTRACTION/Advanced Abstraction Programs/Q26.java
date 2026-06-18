// 26.Write a Java program to create an abstract class Shape and calculate area of Circle, Rectangle, and Triangle.

abstract class Shape {
    String shapName;
    abstract double area();
    abstract double perimeter();

    public Shape(String shapName) {
        this.shapName = shapName;
    }
    

    void display(){
        System.out.println("\n____________________________________________\n");
        System.out.println("Area of "+shapName+" is : "+area());
        System.out.println("Perimeter of "+shapName+" is : "+perimeter());
    }
}

class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        super("Circle");
        this.radius=radius;
    }
    @Override
    double area(){
        return (Math.PI*radius*radius);
    }
    @Override
    double perimeter () {
        return (2*Math.PI*radius);
    }   
} 

class Rectangle extends Shape {
    int length;
    int breadth;

    public Rectangle(int length , int breadth) {
        super("Rectangle");
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    double area () {
        return (length*breadth);
    }
    @Override
    double perimeter () {
        return (2*(length+breadth));
    }
}

class Triangle extends Shape {
    int a,b,c;
    int base,height;

    public Triangle(int a , int b , int c , int base , int height) {
        super("Triangle");
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.height = height;
    }
    @Override
    double area(){
        return (0.5*base*height);
    }
    @Override
    double perimeter () {
        return (a+b+c);
    }
}

public class Q26 {
    public static void main(String[] args) {
        Shape C = new Circle(4);
        C.display();
        Shape R = new Rectangle(5, 6);
        R.display();
        Shape T = new Triangle(2, 4, 5, 4, 7);
        T.display();
    }
}