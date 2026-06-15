// 12.Write a Java program to create an interface Drawable and implement it in Circle and Rectangle.


interface Drawable {
    double area();
    double perimeter();
}

class Circle implements Drawable{
    double radius;
   
    public Circle(double radious) {
        this.radius= radious;
    }
    @Override
    public double area(){
        return (Math.PI*radius*radius);
    }
    @Override
    public double perimeter(){
        return (2*Math.PI*radius);
    }
}

class Rectangle implements Drawable {
    int length;
    int breadth;

    public Rectangle(int length , int bridth) {
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public double area(){
        return (length*breadth);
    }
     @Override
    public double perimeter(){
        return (2*(length+breadth));
    }
    
}
public class Q12 {
    public static void main(String[] args) {
        Drawable c = new Circle(4);
        Drawable r = new Rectangle(3, 4);

        System.out.println("Area of circle : "+c.area());
        System.out.println("Perimeter of circle : "+c.perimeter());

        System.out.println("Area of Rectangle : "+r.area());
        System.out.println("Perimeter of Rectangle : "+r.perimeter());
    }
}
