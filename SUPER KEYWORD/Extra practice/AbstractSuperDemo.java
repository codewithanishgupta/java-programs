// 28.Write a Java program to use super in abstract class inheritance.
/* 
abstract class A{
    int data=2067;
    String name;

    public A(String name) {
        this.name=name;
    }

    void display(){
        System.out.println("Data is : "+data);
        System.out.println("Name : "+name);
    }
    
}

class B extends A{

    public B(String name) {
        super(name);
    }
    void show(){
        super.display();
    }
    
}

public class AbstractSuper {
    public static void main(String[] args) {
        B obj= new B("codewithanishgupta");
        obj.show();
    }
}
*/
// 28. Write a Java program to use super in abstract class inheritance.

abstract class Shape {
    String color;

    abstract double area();

    public Shape(String color) {
        this.color = color;
        System.out.println("Shape constructor called...");
    }

    void displayColor() {
        System.out.println("Color : " + color);
    }
}

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color); 
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    void showDetails() {
        super.displayColor(); 
        System.out.println("Radius : " + radius);
        System.out.println("Area   : " + area());
    }
}

public class AbstractSuperDemo {
    public static void main(String[] args) {
        Circle c = new Circle("Red", 7.0);
        c.showDetails();
    }
}
