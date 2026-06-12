// 6. Write a Java program to demonstrate default constructor.

public class DefaultCons {
    int x,y;

    DefaultCons() {
        x=20;
        y=10;
        System.out.println("This is default constructer \n Data is X = "+x+" Y = "+y);
    }
    public static void main(String[] args) {
        DefaultCons obj = new DefaultCons();
    }
}
