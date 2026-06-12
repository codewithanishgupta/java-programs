// 9.write a Java program to show that this() must be first statement in constructor.


class Demo{
    int x;
    String name;

    public Demo(int x , String name) {
        this.x=x;
        this.name=name;
        System.out.println("Parameterise constructer call.");
    }

    public Demo() {
        this(16,"codewithanishgupta");
        System.out.println("Default constructer call");
    }
    

    
}

public class Q9 {
    public static void main(String[] args) {
        Demo D = new Demo();
    }
}
