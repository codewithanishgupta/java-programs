package circle;

import shape.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    public double area(){
        return (Math.PI*radius*radius);
    }

    public double perimeter (){
        return (2*Math.PI*radius);
    }

    public void displayCircle () {
        super.display();
        System.out.println("Circle with radius: " + radius);
        System.out.println("Area: " + area());
        System.out.println("Peremeter: " + perimeter());
    }
}
