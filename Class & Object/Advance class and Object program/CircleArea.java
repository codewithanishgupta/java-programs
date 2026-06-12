// 23. Write a Java program to create class Circle and calculate area using method.

class Circle{
    private int radius=0;
    float area(int r){
        radius=r;
        return (radius*radius*(float)Math.PI);
    }
}

public class CircleArea {
    public static void main(String[] args) {
        Circle c= new Circle();
        System.out.println("Area of circle : "+c.area(7));
    }
}
