// 10. Write a Java program to overload constructors in a class.


class Example {
    int x,y;
    public Example() {
        x=0;
        y=0;
    }

    public Example(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void show(){
        System.out.println("X :"+x);
        System.out.println("Y : "+y);
    }
}
public class OverloadCons {
    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example(23,40);
        obj1.show();
        obj2.show();
    }
}
