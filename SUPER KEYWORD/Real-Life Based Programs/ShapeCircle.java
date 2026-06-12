// 24.Write a Java program to create class Shape and Circle using
//     super for area calculation.

import java.util.Scanner;

class Shape{
    

    int areaOfRectangle(int l , int b){
        return l*b;
    }

    float areaOfcircle(int r){
        return (3.14f*r*r);
    }
}

class Circle extends Shape{
    void show(){
        System.out.println("Enter the radious : ");
        int r=new Scanner(System.in).nextInt();

        System.out.println("Area of Circle is : "+ areaOfcircle(r));
    }
}


public class ShapeCircle {
    public static void main(String[] args) {
        Circle C= new Circle();
        C.show();
    }
}
