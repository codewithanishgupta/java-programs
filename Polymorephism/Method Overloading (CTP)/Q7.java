// 6.Write a Java program to overload a method that calculates the volume of:Cube,Cylinder,Cuboid 

class VolumeCalculator {
    // Volume of Cube
    double volume(int side) {
        return side * side * side;
    }

    // Volume of Cylinder
    double volume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    // Volume of Cuboid
    double volume(int length, int breadth, int height) {
        return length * breadth * height;
    }
}

public class Q7 {
    public static void main(String[] args) {
        VolumeCalculator v = new VolumeCalculator();

        System.out.println("Volume of Cube: " + v.volume(5));
        System.out.println("Volume of Cylinder: " + v.volume(3.5, 10.0));
        System.out.println("Volume of Cuboid: " + v.volume(4, 5, 6));
    }
}

