// 11. Write a Java program to create a method inside class to perform addition.

public class Methodsum {
    static int sum(int x, int y){
        return (x+y);
    }
    public static void main(String[] args)  {
        int result = sum(20,30);
        System.out.println("Addition is : " + result);
    }
}
