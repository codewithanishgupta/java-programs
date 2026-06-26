// 2.Create an interface Shape with a method area(). Implement it in classes Circle and Rectangle. 

interface Shape {
    double area ();
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius ;
    }
    @Override
    public double area () {
        return Math.PI * radius *radius ;
    }
}

class Rectangle implements Shape {
    double length;
    double bredth;

    public Rectangle(double length , double bredth) {
        this.length = length;
        this.bredth = bredth;
    }
    @Override
    public double area (){
        return length * bredth;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Shape shapes [] = {new Circle(23) , new Rectangle(10, 30)};
        for(Shape s : shapes){
            System.out.println(s.getClass().getSimpleName()+" Area : "+s.area());
                            // this method simple print class name
        }
    }
}
