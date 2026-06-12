// 27.Write a Java program to show error when this() is not first statement.

class Demo{

    public Demo() {
        this(20);
        System.out.println("Default constructer ...");
        // this(20); // error because this() must be first.
    }

    Demo(int x){
        System.out.println("Value = "+x);
    }
    
}

public class Q27 {
    public static void main(String[] args) {
        Demo d= new Demo();
    }
}
